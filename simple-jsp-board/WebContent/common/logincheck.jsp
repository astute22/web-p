<%@ page pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("loginUser") == null){
		//로그인 완료 후 되돌아갈 주소
		String url = (String) pageContext.getAttribute("url");
		String path = "/simple-jsp-board/user/loginform.jsp?deny=1&returnUrl="+url;
		response.sendRedirect(path);
		return;
	}
%>
