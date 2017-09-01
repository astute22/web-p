package util;

import javax.servlet.http.Cookie;

public class WebUtils {

	public static String getCookieValue(Cookie[] cookies, String name){
		if(cookies == null){
			return null;
		}
		if(name == null){
			return null;
		}
		String value = null;
		for(Cookie cookie : cookies){
			String cookieName = cookie.getName();
			if(name.equals(cookieName)){
				value = cookie.getValue();
			}
		}
		return value;
	}
}
