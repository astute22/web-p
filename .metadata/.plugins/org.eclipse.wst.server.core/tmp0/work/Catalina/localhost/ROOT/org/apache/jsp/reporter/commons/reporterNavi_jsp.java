/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.16
 * Generated at: 2017-09-07 00:09:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.reporter.commons;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kr.co.jtimes.reporter.profile.common.vo.ReporterEmployeeVo;

public final class reporterNavi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("kr.co.jtimes.reporter.profile.common.vo.ReporterEmployeeVo");
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
      out.write("\r\n");
      out.write("    ");

    	ReporterEmployeeVo loginReporter = (ReporterEmployeeVo) session.getAttribute("loginReporter");
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
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"><strong>기사 관리</strong><span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"");
      out.print("tot".equals(cp)?"active":"");
      out.write("\"><a href=\"#\">소분류1</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"");
      out.print("cul".equals(cp)?"active":"");
      out.write("\"><a href=\"#\">소분류2</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"");
      out.print("eco".equals(cp)?"active":"");
      out.write("\"><a href=\"#\">소분류3</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li class=\"dropdown active\"><a class=\"dropdown-toggle ");
      out.print("u".equals(cp)?"active":"");
      out.write("\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"><strong>사진 관리</strong><span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"");
      out.print("tot".equals(cp)?"active":"");
      out.write("\"><a href=\"#\">소분류1</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"");
      out.print("cul".equals(cp)?"active":"");
      out.write("\"><a href=\"#\">소분류2</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"");
      out.print("eco".equals(cp)?"active":"");
      out.write("\"><a href=\"#\">소분류3</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li class=\"");
      out.print("de4".equals(cp)?"active":"");
      out.write("\"><a href=\"#\"><strong>대분류3</strong></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t");
if(loginReporter == null) {
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"/reporter/profile/login.jsp\"><span class=\"glyphicon glyphicon-log-in ");
      out.print("log".equals(cp)?"active":"");
      out.write("\"></span>\r\n");
      out.write("\t\t\t\t\t\t<strong>로그인</strong></a></li>\r\n");
      out.write("\t\t\t");
} else { 
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"/reporter/profile/profile.jsp\"><strong>프로필 확인</strong></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/reporter/profile/reporterLogout.jsp\"><span class=\"glyphicon glyphicon-log-out ");
      out.print("log".equals(cp)?"active":"");
      out.write("\"><strong>로그아웃</strong></a></li>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>");
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