package filters;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;

import vo.User;

public class AuthorizationFilter implements Filter{

	private Map<String, List<String>> map = new HashMap<>();
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		map.put("/mail.html", Arrays.asList("USER","ADMIN"));
		map.put("/admin.html", Arrays.asList("ADMIN"));
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		String path = (String) req.getAttribute("path");
		System.out.println("path : " + path);
		
		List<String> roles = map.get(path);
		System.out.println(roles);
		
		if(roles != null){
			HttpServletRequest httpReq = (HttpServletRequest) req;
			HttpSession session = httpReq.getSession(false);
			User user = (User) session.getAttribute("userInfo");
			
			if(!roles.contains(user.getRole())){
				throw new ServletException("안돼 보여줄생각 없어 도라가 접근권한 : "+roles+" 보유권한 : " + user.getRole());
			}
		}
		
		filterChain.doFilter(req, res);
		
	}

}
