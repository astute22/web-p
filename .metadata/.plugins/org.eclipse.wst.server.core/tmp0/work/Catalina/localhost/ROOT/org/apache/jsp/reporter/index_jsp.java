/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.16
 * Generated at: 2017-09-12 07:58:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.reporter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kr.co.jtimes.reporter.profile.common.vo.ReporterEmployeeVo;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/reporter/commons/loginCheck.jsp", Long.valueOf(1504699923853L));
    _jspx_dependants.put("/reporter/commons/reporterFooter.jsp", Long.valueOf(1504527193683L));
    _jspx_dependants.put("/reporter/commons/reporterNavi.jsp", Long.valueOf(1505129191030L));
  }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        .profile {\r\n");
      out.write("            border-bottom: 3px solid black;\r\n");
      out.write("        }\r\n");
      out.write("        .margintop {margin-top: 150px;}\r\n");
      out.write("        .container {margin: 0 auto; width:1024px;}\r\n");
      out.write("        .newscon {\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("            border: 2px solid silver;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            padding-bottom: 20px;\r\n");
      out.write("            padding-top: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        a {cursor: pointer;}\r\n");
      out.write("        .legend-con {width:auto; margin-left:150px; border: none;}\r\n");
      out.write("        .display-inline{display: inline;}\r\n");
      out.write("        .btn-confirm {margin-left:50px; margin-top: 20px;}\r\n");
      out.write("        .btn-category {margin-left:50px; margin-top: 20px;}\r\n");
      out.write("        a.newstitle {margin-left: 50px; text-decoration: none; width:500px; overflow: hidden;}\r\n");
      out.write("    </style>\r\n");
      out.write("    <title>메인 페이지</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');
 
	if(session.getAttribute("loginReporter") == null) {
		//로그인 완료 후 되돌아갈 url가져오기
		String url = (String) pageContext.getAttribute("url");
		String path = "/reporter/profile/login.jsp?deny=1&returnUrl="+url;
		response.sendRedirect(path);
		
		return;
	}

      out.write('\r');
      out.write('\n');
 pageContext.setAttribute("cp", "p"); 
      out.write('\r');
      out.write('\n');
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
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"/reporter/\"><img src=\"/commons/img/logo.png\" alt=\"logoImage\" /></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t<li class=\"");
      out.print("p".equals(cp)?"active":"");
      out.write("\"><a href=\"/reporter/\"><strong>홈</strong></a></li>\r\n");
      out.write("\t\t\t\t<li class=\"dropdown ");
      out.print("news".equals(cp)?"active":"");
      out.write("\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"><strong>기사 관리</strong><span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"/reporter/news/addNews.jsp\">기사 작성</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"/reporter/news/writeList.jsp\">작성 목록</a></li>\r\n");
      out.write("\t\t\t\t\t");

						int loginUserPos =((ReporterEmployeeVo)session.getAttribute("loginReporter")).getReporterPos().getPositionNo();
						if(loginUserPos == 100 ||loginUserPos == 200) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"/reporter/news/confirmNews.jsp\">결재 목록</a></li>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li class=\"dropdown ");
      out.print("img".equals(cp)?"active":"");
      out.write("\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"><strong>사진 관리</strong><span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"/reporter/imageContainer/\">사진 검색</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"/reporter/imageContainer/addPicture.jsp\">사진 등록</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"#\">소분류3</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li class=\"");
      out.print("de4".equals(cp)?"active":"");
      out.write("\"><a href=\"/reporter/profile/reporterList.jsp\"><strong>기자 관리</strong></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t");
if(loginReporter == null) {
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"");
      out.print("log".equals(cp)?"active":"");
      out.write("\"><a href=\"/reporter/profile/login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span>\r\n");
      out.write("\t\t\t\t\t\t<strong>로그인</strong></a></li>\r\n");
      out.write("\t\t\t");
} else { 
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"/reporter/profile/profile.jsp\"><strong>프로필 확인</strong></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"/reporter/profile/reporterLogout.jsp\"><span class=\"glyphicon glyphicon-log-out\"></span><strong>로그아웃</strong></a></li>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>");
      out.write('\r');
      out.write('\n');
	
	ReporterEmployeeVo re = (ReporterEmployeeVo)session.getAttribute("loginReporter");

      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"profile row\">\r\n");
      out.write("            <div class=\"col-xs-offset-5 col-xs-4 text-right\">\r\n");
      out.write("                <h4 class=\"display-inline\"><span class=\"label label-default\">");
      out.print(re.getReporterPos().getPositionName() );
      out.write("</span></h4>\r\n");
      out.write("                <h4 class=\"display-inline\"><span class=\"label label-default\">");
      out.print(re.getReporterName() );
      out.write('(');
      out.print(re.getReporterId() );
      out.write(")님 환영합니다.</span></h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xs-3 text-right\">\r\n");
      out.write("                <a href=\"/reporter/profile/profile.jsp\" class=\"btn btn-primary btn-xs\">프로필 수정</a>\r\n");
      out.write("                <a href=\"/reporter/news/addNews.jsp\" class=\"btn btn-warning btn-xs\">기사 작성</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <fieldset class=\"newscon\">\r\n");
      out.write("            <legend class=\"display-inline legend-con\">[ 시사 ]</legend>\r\n");
      out.write("            <div id=\"news-box-10\"></div>\r\n");
      out.write("            <div class=\"text-center\">\r\n");
      out.write("                <ul class=\"pagination pagination-sm\" id=\"news-page-10\"></ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("        <fieldset class=\"newscon\">\r\n");
      out.write("            <legend class=\"display-inline legend-con\">[ 경제 ]</legend>\r\n");
      out.write("            <div id=\"news-box-20\"></div>\r\n");
      out.write("            <div class=\"text-center\">\r\n");
      out.write("                <ul class=\"pagination pagination-sm\" id=\"news-page-20\"></ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("        \r\n");
      out.write("        <fieldset class=\"newscon\">\r\n");
      out.write("            <legend class=\"display-inline legend-con\">[ 스포츠 ]</legend>\r\n");
      out.write("            <div id=\"news-box-30\"></div>\r\n");
      out.write("            <div class=\"text-center\">\r\n");
      out.write("                <ul class=\"pagination pagination-sm\" id=\"news-page-30\"></ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("        <fieldset class=\"newscon\">\r\n");
      out.write("            <legend class=\"display-inline legend-con\">[ 연예 ]</legend>\r\n");
      out.write("            <div id=\"news-box-40\"></div>\r\n");
      out.write("            <div class=\"text-center\">\r\n");
      out.write("                <ul class=\"pagination pagination-sm\" id=\"news-page-40\"></ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("    </div>\r\n");
      out.write("   ");
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction requestNews(newsCategory, pageNo){\r\n");
      out.write("\t\tvar xhr = new XMLHttpRequest();\r\n");
      out.write("\t\txhr.onreadystatechange = function(){\r\n");
      out.write("\t\t\tif(xhr.readyState == 4 && xhr.status == 200) {\r\n");
      out.write("\t\t\t\tvar jsonText = xhr.responseText;\r\n");
      out.write("\t\t\t\tvar news = JSON.parse(jsonText);\r\n");
      out.write("\t\t\t\tvar beginPage = news.beginPage;\r\n");
      out.write("\t\t\t\tvar endPage = news.endPage;\r\n");
      out.write("\t\t\t\tvar currentNaviBlock = news.currentNaviBlock;\r\n");
      out.write("\t\t\t\tvar totalNaviBlock = news.totalNaviBlock;\r\n");
      out.write("\t\t\t\tvar newsList = news.newsList;\r\n");
      out.write("\t\t\t\tvar newsCategory = news.newsCategory;\r\n");
      out.write("\t\t\t\tvar totalPages = news.totalPages;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar htmlContents = \"\";\r\n");
      out.write("\t\t\t\tnewsList.forEach(function (newsItem, index) {\r\n");
      out.write("\t\t\t\t\tvar stateStr;\r\n");
      out.write("\t\t\t\t\tvar className;\r\n");
      out.write("\t\t\t\t\tif(newsItem.newsSignState == \"N\") {\r\n");
      out.write("\t\t\t\t\t\tstateStr = \"승인대기\";\r\n");
      out.write("\t\t\t\t\t\tclassName = \"label-warning\";\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tstateStr = \"승인완료\";\r\n");
      out.write("\t\t\t\t\t\tclassName = \"label-success\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tvar newsTypeClass;\r\n");
      out.write("\t\t\t\t\tif(newsItem.newsType.newsTypeNo == 100) {\r\n");
      out.write("\t\t\t\t\t\tnewsTypeClass = \"label-default\";\r\n");
      out.write("\t\t\t\t\t} else if(newsItem.newsType.newsTypeNo == 200){\r\n");
      out.write("\t\t\t\t\t\tnewsTypeClass = \"label-info\";\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tnewsTypeClass = \"label-danger\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\thtmlContents += '<h4 class=\"display-inline col-xs-1\"><span class=\"label '+className+' btn-confirm\">'+stateStr+'</span></h4>';\r\n");
      out.write("\t\t\t\t\thtmlContents += '<h4 class=\"display-inline col-xs-1\"><span class=\"label '+newsTypeClass+' btn-category\">'+newsItem.newsType.newsTypeName+'</span></h4>';\r\n");
      out.write("\t\t\t\t\thtmlContents += '<a href=\"/reporter/news/detailNews.jsp?type=view&newsNo='+newsItem.newsNo+'\" class=\"newstitle btn col-xs-7\">'+newsItem.newsTitle+'</a>';\r\n");
      out.write("\t\t\t\t\thtmlContents += '<h4 class=\"display-inline col-xs-2\"><span class=\"label label-primary \">'+newsItem.regdate+'</span></h4>';\r\n");
      out.write("\t\t\t\t\thtmlContents += '<h4 class=\"display-inline col-xs-1\"><span class=\"label label-primary \">'+newsItem.reporter.reporterName+'</span></h4>';\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"news-box-\"+newsCategory).innerHTML = htmlContents;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar pageHTML = \"\";\r\n");
      out.write("                if(pageNo != 1) {\r\n");
      out.write("                \tpageHTML +='<li><a onclick=\"javascript:requestNews('+newsCategory+','+(pageNo-1)+')\">&lt;</a></li>';\r\n");
      out.write("                }\r\n");
      out.write("\t\t\t\tfor(var i = beginPage; i <= endPage; ++i) {\r\n");
      out.write("\t\t\t\t\tpageHTML += '<li class=\"'+((i == pageNo)?'active':'')+'\"><a onclick=\"javascript:requestNews('+newsCategory+','+ i +')\">' + i + '</a></li>'\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(!(pageNo >= totalPages)){\r\n");
      out.write("\t\t\t\t\tpageHTML += '<li><a onclick=\"javascript:requestNews('+newsCategory+','+(pageNo+1)+')\">&gt;</a></li>';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"news-page-\"+newsCategory).innerHTML = pageHTML;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\txhr.open(\"GET\", \"/reporter/news/getNewsProcess.jsp?category=\"+newsCategory+\"&pno=\"+pageNo);\r\n");
      out.write("\t\txhr.send(null);\r\n");
      out.write("\t}\r\n");
      out.write("\trequestNews(10, 1);\r\n");
      out.write("\trequestNews(20, 1);\r\n");
      out.write("\trequestNews(30, 1);\r\n");
      out.write("\trequestNews(40, 1);\r\n");
      out.write("</script>\r\n");
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