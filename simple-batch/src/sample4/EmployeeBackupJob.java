package sample4;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class EmployeeBackupJob implements Job{

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		try{
			PrintWriter out = new PrintWriter("c:/temp/CitizenReport.csv");
			out.println("게시글번호,게시글제목,게시글내용,작성일,회원번호");
			
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.92:1521:xe", "jtimes", "zxcv1234");
			PreparedStatement pstmt = con.prepareStatement("select * from TB_CITIZEN_REPORT where CR_TITLE != 'dd' order by cr_no");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				int no = rs.getInt("cr_no");
				String title = rs.getString("CR_TITLE");
				long contents = rs.getLong("CR_CONTENTS");
				Date regdate = rs.getDate("CR_REGDATE");
				int writerNo = rs.getInt("CR_WRITER_NO");
				
				out.println(no+","+title+","+contents+","+regdate+","+writerNo);
			}
			rs.close();
			pstmt.close();
			con.close();
			
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
