/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.16
 * Generated at: 2017-09-05 12:22:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.reporter.news;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class watermark_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Bootstrap Example</title>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t$(window).on(\"load\",(function() {    \r\n");
      out.write("\t     $('#loading').hide();  \r\n");
      out.write("\t    }));\r\n");
      out.write("\tvar url;\r\n");
      out.write("\t\tfunction watermarkMaking() {\r\n");
      out.write("\t\t\t$('#loading').show(); \r\n");
      out.write("\t\t\tvar formData = new FormData($(\"#form\")[0]);\r\n");
      out.write("\t\t\tformData.append(\"f\", $(\"#f\")[0].files[0]);\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\turl : \"watermarkmk.jsp\",\r\n");
      out.write("\t\t\t\tprocessData: false,\r\n");
      out.write("\t\t\t\tcontentType: false,\r\n");
      out.write("\t\t\t\tdata : formData,\r\n");
      out.write("\t\t\t\tsuccess : function(res) {\r\n");
      out.write("\t\t\t\t\turl = res;//.replace(/[\\n]/g, \"\");\r\n");
      out.write("\t\t\t\t\t$(\"#ajaximg\").css(\"display\", \"block\");\r\n");
      out.write("\t\t\t\t\t$(\"#ajaximg\").attr(\"src\", \"/img/\"+url);\r\n");
      out.write("\t\t\t\t\tvar encoded = encodeURI($(\"#ajaximg\").attr(\"src\"));\r\n");
      out.write("\t\t\t\t\t$(\"#ajaximg\").attr(\"src\", encoded);\r\n");
      out.write("\t\t\t\t\t$('#loading').hide();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t#loading {\r\n");
      out.write("\t\t width: 100%;  \r\n");
      out.write("\t\t height: 100%;  \r\n");
      out.write("\t\t top: 0px;\r\n");
      out.write("\t\t left: 0px;\r\n");
      out.write("\t\t position: fixed;  \r\n");
      out.write("\t\t display: block;  \r\n");
      out.write("\t\t opacity: 0.7;  \r\n");
      out.write("\t\t background-color: #fff;  \r\n");
      out.write("\t\t z-index: 99;  \r\n");
      out.write("\t\t text-align: center; } \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t#loading-image {  \r\n");
      out.write("\t\t position: absolute;  \r\n");
      out.write("\t\t top: 50%;  \r\n");
      out.write("\t\t left: 50%; \r\n");
      out.write("\t\t z-index: 100; }\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<h1>첨부파일 업로드</h1>\r\n");
      out.write("\t<form method=\"post\" id=\"form\" action=\"javascript:watermarkMaking();\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t<input type=\"file\" name=\"f\" id=\"f\"> <br/>\r\n");
      out.write("\t\t<button type=\"submit\">파일 업로드</button>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<img src=\"\" id=\"ajaximg\" style=\"display:hidden; width:100%\">\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"loading\"><img id=\"loading-image\" src=\"/img/ajax-loader.gif\" alt=\"Loading...\" /></div>\r\n");
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