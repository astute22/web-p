/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.16
 * Generated at: 2017-09-06 00:16:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.reporter.news;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detailNews_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/reporter/commons/reporterFooter.jsp", Long.valueOf(1504527193683L));
    _jspx_dependants.put("/reporter/commons/reporterNavi.jsp", Long.valueOf(1504656852816L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- \r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.news {line-height: 40px;}\r\n");
      out.write("</style>\r\n");
      out.write(" -->\r\n");
      out.write(" <style>\r\n");
      out.write(" \tdiv.info {\r\n");
      out.write(" \t\tcolor:gray;\r\n");
      out.write(" \t}\r\n");
      out.write(" \tspan {\r\n");
      out.write(" \t\tline-height:40px; \r\n");
      out.write(" \t\tcolor:gray;\r\n");
      out.write(" \t}\r\n");
      out.write(" </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    ");

    	String cp = (String)pageContext.getAttribute("cp");
    
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\t.navbar-inverse .navbar-brand,\r\n");
      out.write("\t.navbar-inverse .navbar-brand:hover,\r\n");
      out.write("\t.navbar-inverse .navbar-brand:focus,\r\n");
      out.write("\t.navbar-inverse .navbar-nav > li > a,\r\n");
      out.write("\t.navbar-inverse .navbar-nav > li > a:hover,\r\n");
      out.write("\t.navbar-inverse .navbar-nav > li > a:focus{\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfont-size: 15px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.navbar-inverse .navbar-nav > .active > a, \r\n");
      out.write("\t.navbar-inverse .navbar-nav > .active > a:hover, \r\n");
      out.write("\t.navbar-inverse .navbar-nav > .active > a:focus {\r\n");
      out.write("  \t  \r\n");
      out.write("  \t  background-color: #990000;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.navbar-header,\r\n");
      out.write("\t.navbar-form{\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tpadding-top: 10px;\r\n");
      out.write("\t\tpadding-bottom: 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.navbar-nav > li > a{\r\n");
      out.write("\t\tpadding-top: 25px;\r\n");
      out.write("\t\tpadding-bottom: 25px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.navbar-brand img {\r\n");
      out.write("\t\theight: auto;\r\n");
      out.write("\t\twidth:150px;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\t<nav class=\"navbar navbar-static-top navbar-inverse\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header \">\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\"><img src=\"/commons/img/logo.png\" alt=\"logoImage\" /></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t<li class=\"");
      out.print("h".equals(cp)?"active":"");
      out.write("\"><a href=\"/reporter/index.jsp\"><strong>홈</strong></a></li>\r\n");
      out.write("\t\t\t\t<li class=\"dropdown active\"><a class=\"dropdown-toggle ");
      out.print("u".equals(cp)?"active":"");
      out.write("\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"><strong>기사 카테고리</strong><span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"");
      out.print("cul".equals(cp)?"active":"");
      out.write("\"><a href=\"#\">시사</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"");
      out.print("eco".equals(cp)?"active":"");
      out.write("\"><a href=\"#\">경제</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"");
      out.print("sop".equals(cp)?"active":"");
      out.write("\"><a href=\"#\">스포츠</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"");
      out.print("ent".equals(cp)?"active":"");
      out.write("\"><a href=\"#\">연예</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li class=\"");
      out.print("de2".equals(cp)?"active":"");
      out.write("\"><a href=\"/reporter/news/confirmNews.jsp\"><strong>기사 관리</strong></a></li>\r\n");
      out.write("\t\t\t\t<li class=\"");
      out.print("de3".equals(cp)?"active":"");
      out.write("\"><a href=\"#\"><strong>사진 관리</strong></a></li>\r\n");
      out.write("\t\t\t\t<li class=\"");
      out.print("de4".equals(cp)?"active":"");
      out.write("\"><a href=\"#\"><strong>프로필 관리</strong></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<form class=\"navbar-form navbar-left\">\r\n");
      out.write("\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"검색어를 입력하세요\">\r\n");
      out.write("\t\t\t\t\t<div class=\"input-group-btn\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-default\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-search\"></i>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t<li><a href=\"/reporter/profile/login.jsp\"><span class=\"glyphicon glyphicon-log-in ");
      out.print("log".equals(cp)?"active":"");
      out.write("\"></span>\r\n");
      out.write("\t\t\t\t\t\t<strong>로그인</strong></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-offset-sm-2 col-sm-7\">\r\n");
      out.write("\t\t\t<div class=\"row panel panel-body\">\r\n");
      out.write("\t\t\t\t<h3><strong>[2018 러시아 월드컵 최종예선] 프랑스, 네덜란드 대파…스웨덴전 패배 극복</strong></h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t\t<span><small>기사입력 2017.09.01 오전 10:42</small></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t[매경닷컴 MK스포츠 강대호 기자] 2018 러시아 월드컵 최종예선에서 프랑스가 첫 패배의 충격을 대승으로 만회했다.\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t프랑스는 1일 네덜란드와의 2018 러시아 월드컵 최종예선 유럽 A조 7차전 홈경기를 4-0으로 이겼다. 2016 유럽축구연맹(UEFA) 챔피언스리그 기량발전 베스트11 토마 르마(22·모나코)가 2골로 공격을 주도했다.\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t스웨덴과의 6차전 원정경기에서 1-2로 진 프랑스는 잉글랜드와의 홈 평가전 3-2 승리에 이어 네덜란드도 압도했다. 5승 1무 1패 득실차 +10 승점 16으로 2위 스웨덴(13점)보다 나은 A조 선두다.\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"row text-center\">\r\n");
      out.write("\t\t\t\t<img src=\"12.jpg\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row text-center\">\r\n");
      out.write("\t\t\t\t<span><small>2018 러시아 월드컵 최종예선 네덜란드전 2골의 주인공 토마 르마. 사진=AFPBBNews=News1</small></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<p>2016 스페인 라리가 MVP 앙투안 그리즈만(26·아틀레티코) 역시 1골 1도움으로 네덜란드 격파에 큰 힘이 됐다. 2016-17 UEFA 챔피언스리그 우수 18인에 포함된 킬리안 음바페(19·파리 생제르맹)도 1득점 했다.</p>\r\n");
      out.write("\t\t\t\t<p>2011-12 리그1 득점왕 올리비에 지루(31·아스널)와 2016-17 리그1 베스트11 지브릴 시디베(25·모나코)도 1도움씩하며 전·현직 프랑스프로축구 스타다운 면모를 보였다.</p>\r\n");
      out.write("\t\t\t\t<p>[dogma01@maekyung.com]</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group text-right\">\r\n");
      out.write("\t             <button class=\"btn btn-danger\">수정</button>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<footer class=\"bd-footer text-muted\" style=\"bottom:0; width:100%; height:70px;\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row col-xs-2\">\r\n");
      out.write("\t\t\t\t<h2>J Times</h2>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row col-xs-10\">\r\n");
      out.write("    \t\t\t<p>Copyright ⓒ All rights reserved <span class=\"glyphicon glyphicon-phone-alt\" aria-hidden=\"true\">010)1111-1111</span></p>\r\n");
      out.write("    \t\t\t<p>주소: 서울특별시 종로구 율곡로10길 105 디아망 401호(봉익동 10-1 디아망 401호) 등록일자: 20XX.XX.XX 발행인/편집인: 김형택</p>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}