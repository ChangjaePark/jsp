/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.8
 * Generated at: 2019-04-30 01:40:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pageView_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

		request.setCharacterEncoding("EUC-KR");
		int totalRecord = //총게시물수
		Integer.parseInt(request.getParameter("totalRecord"));
		int numPerPage = 10;//페이지당 레코드수
		int pagePerBlock = 15;//블럭당 페이지수
		int totalBlock = 0;
		int totalPage = 0;
		int nowPage = 1;//현재페이지
		int nowBlock = 1;//현재블럭
		
		int start=0; //디비의 select 시작번호
	    int end=10; //시작번호로 부터 가져올 select 갯수
	    
	    //nowPage를 요청한 경우, 만약 요청하지 않으면 default 값인 0이다.
	    if(request.getParameter("nowPage")!=null){
	    	nowPage = Integer.parseInt(request.getParameter("nowPage"));
	    }
	    start = (nowPage*numPerPage)-numPerPage;
	    
	    //전체 페이지 수
	    totalPage = (int)Math.ceil((double)totalRecord/numPerPage);
	    
	    //전체 블럭 수
	    totalBlock = (int)Math.ceil((double)totalPage/pagePerBlock);
	    
	    //현재블럭
	    nowBlock = (int)Math.ceil((double)nowPage/pagePerBlock);

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>페이징 & 블럭 처리 테스트</title>\r\n");
      out.write("</head>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction pageing(page){\r\n");
      out.write("\t\tdocument.readFrm.nowPage.value=page;\r\n");
      out.write("\t\tdocument.readFrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction block(block){\r\n");
      out.write("\t\tdocument.readFrm.nowPage.value=");
      out.print(pagePerBlock);
      out.write("*(block-1)+1;\r\n");
      out.write("\t\tdocument.readFrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<body bgcolor=\"#FFFFCC\">\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<h2>페이징 & 블럭 처리 테스트</h2>\r\n");
      out.write("<table>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"700\" align=\"center\">\r\n");
      out.write("\t\tTotal : ");
      out.print(totalRecord);
      out.write("Articles(\r\n");
      out.write("\t\t<font color=\"red\">");
      out.print(nowPage+"/"+totalPage);
      out.write("</font>\r\n");
      out.write("\t\t)\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>게시물 번호 : &nbsp;</td>\r\n");
      out.write("\t\t");

				int listSize = totalRecord-start;
				for(int i=0; i<numPerPage; i++){
					if(i==listSize) break;
		
      out.write("\t\t\r\n");
      out.write("\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t");
      out.print(totalRecord-((nowPage-1)*numPerPage)-i );
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t");
}//---for
      out.write("\r\n");
      out.write("\t\t<td align=\"center\">&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<!-- 페이징 & 블럭 Start -->\r\n");
      out.write("<table>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t");

				//페이지에 표시될 시작 변수 및 마지막 변수
				int pageStart = (nowBlock-1)*pagePerBlock+1;
				int pageEnd = ((pageStart+pagePerBlock)<=totalPage)?(pageStart+pagePerBlock):totalPage+1;
			
      out.write("\r\n");
      out.write("\t\t\t");
if(totalPage!=0){ 
      out.write("\r\n");
      out.write("\t\t\t<!-- 이전 블럭 -->\r\n");
      out.write("\t\t\t");
if(nowBlock>1){
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"javascript:block('");
      out.print(nowBlock-1);
      out.write("')\">prev...</a>\r\n");
      out.write("\t\t\t");
}
      out.write("&nbsp;\t\t\t\r\n");
      out.write("\t\t\t<!-- 페이징 -->\r\n");
      out.write("\t\t\t");
for(;pageStart<pageEnd;pageStart++){	
      out.write("\r\n");
      out.write("\t\t\t<a href=\"javascript:pageing('");
      out.print(pageStart);
      out.write("')\">\r\n");
      out.write("\t\t\t");
if(nowPage==pageStart){
      out.write("<font color=\"red\">");
}
      out.write("\r\n");
      out.write("\t\t\t[");
      out.print(pageStart);
      out.write("]</a>\r\n");
      out.write("\t\t\t");
if(nowPage==pageStart){
      out.write("</font>");
}
      out.write("\r\n");
      out.write("\t\t\t");
}//---for
      out.write("&nbsp;\r\n");
      out.write("\t\t\t<!-- 다음 블럭 -->\r\n");
      out.write("\t\t\t");
if(totalBlock>nowBlock){
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"javascript:block('");
      out.print(nowBlock+1);
      out.write("')\">...next</a>\r\n");
      out.write("\t\t\t");
}
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
}//---if
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<!-- 페이징 & 블럭 End -->\r\n");
      out.write("<hr width=\"45%\"/>\r\n");
      out.write("<form name=\"readFrm\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"totalRecord\" value=\"");
      out.print(totalRecord );
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"nowPage\" value=\"");
      out.print(nowPage );
      out.write("\">\r\n");
      out.write("</form>\r\n");
      out.write("<b>\r\n");
      out.write("totalRecord : ");
      out.print(totalRecord);
      out.write("&nbsp;\r\n");
      out.write("numPerPage : ");
      out.print(numPerPage);
      out.write("&nbsp;\r\n");
      out.write("pagePerBlock : ");
      out.print(pagePerBlock);
      out.write("&nbsp;\r\n");
      out.write("totalPage : ");
      out.print(totalPage);
      out.write("&nbsp;<br/>\r\n");
      out.write("totalBlock : ");
      out.print(totalBlock);
      out.write("&nbsp;\r\n");
      out.write("nowPage : ");
      out.print(nowPage);
      out.write("&nbsp;\r\n");
      out.write("nowBlock : ");
      out.print(nowBlock);
      out.write("&nbsp;\r\n");
      out.write("start : ");
      out.print(start);
      out.write("&nbsp;\r\n");
      out.write("</b>\r\n");
      out.write("<p/>\r\n");
      out.write("<input type=\"button\" value=\"TotalRecord 입력폼\"\r\n");
      out.write(" onClick=\"javascript:location.href='pageView.html'\">\r\n");
      out.write("</div>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
