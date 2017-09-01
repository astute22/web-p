package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter{

	private String defaultEncodingType;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		defaultEncodingType = filterConfig.getInitParameter("encoding");
		
		if(defaultEncodingType == null){
			defaultEncodingType = "UTF-8";
		}
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding(defaultEncodingType);
		
		filterChain.doFilter(req, res);
		
	}

}
