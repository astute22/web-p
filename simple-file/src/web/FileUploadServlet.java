package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.FileDao;
import vo.FileInfo;


@WebServlet("/upload.html")
@MultipartConfig()
public class FileUploadServlet extends HttpServlet{

	private static final String SAVED_DIRECTORY = "C:\\web_eclipse\\attached-files\\";
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		String summary = req.getParameter("summary");
		System.out.println("설명 : " + summary);
		
		Part part = req.getPart("f");
		String filename = getFilename(part);
		long fileSize = part.getSize();
		System.out.println(filename);
		System.out.println(part.getContentType());
		System.out.println(fileSize);
		
		part.write(SAVED_DIRECTORY + filename);
		
		FileInfo fileInfo = new FileInfo();
		fileInfo.setName(filename);
		fileInfo.setSize(fileSize);
		fileInfo.setSummary(summary);
		
		FileDao dao = new FileDao();
		dao.addFileInfo(fileInfo);
		
		res.sendRedirect("list.html");
	}
	private String getFilename(Part part){
		String contentDisposition = part.getHeader("content-disposition");
		String[] items = contentDisposition.split(";");
		for(String item : items){
			if(item.trim().startsWith("filename")){
				return item.substring(item.indexOf("=")+2, item.length()-1);
			}
		}
		return null;
	}
}
