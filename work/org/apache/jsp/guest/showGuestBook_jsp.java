/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.8
 * Generated at: 2019-04-24 05:12:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.guest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import guestbook.CommentBean;
import guestbook.JoinBean;
import guestbook.GuestBookBean;
import java.util.Vector;
import guestbook.GuestBookMgr;

public final class showGuestBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/guest/getSession.jsp", Long.valueOf(1555982876059L));
    _jspx_dependants.put("/guest/postGuestBook.jsp", Long.valueOf(1555913453170L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("guestbook.CommentBean");
    _jspx_imports_classes.add("java.util.Vector");
    _jspx_imports_classes.add("guestbook.GuestBookBean");
    _jspx_imports_classes.add("guestbook.JoinBean");
    _jspx_imports_classes.add("guestbook.GuestBookMgr");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	request.setCharacterEncoding("EUC-KR");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write('\r');
      out.write('\n');

	String id = (String)session.getAttribute("idKey");
	if(id==null)
	{
		StringBuffer url = request.getRequestURL();
		response.sendRedirect("login.jsp?url="+url);
				
	}
	else
	{//닫는 중괄호는 이 페이지를 include하는 페이지에 구현
		
	

      out.write("\r\n");
      out.write("<title>GuestBook</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction updateFn(num){\r\n");
      out.write("\t\turl=\"updateGuestBook.jsp?num=\"+num;\r\n");
      out.write("\t\twindow.open(url,\"Update GuestBook\", \"width=520, height=300\");\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction commentPost(frm)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(frm.comment.value==\"\")\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\talert(\"내용을 입력해 주세요.\");\r\n");
      out.write("\t\t\t\tfrm.comment.focus();\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t//<div id=\"cmt\">\r\n");
      out.write("\tfunction disFn(num)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar txt =\"cmt\"+num;\r\n");
      out.write("\t\tvar e = document.getElementById(txt);\r\n");
      out.write("\t\tif(e.style.display=='none')\r\n");
      out.write("\t\t\t   e.style.display = 'block';\r\n");
      out.write("\t\telse e.style.display = 'none';\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#996600\">\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t");
      out.write('\r');
      out.write('\n');
      guestbook.JoinBean login = null;
      synchronized (session) {
        login = (guestbook.JoinBean) _jspx_page_context.getAttribute("login", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (login == null){
          login = new guestbook.JoinBean();
          _jspx_page_context.setAttribute("login", login, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>GuestBook</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction checkInputs() {\r\n");
      out.write("\t\tfrm = document.postFrm;\r\n");
      out.write("\t\tif(frm.contents.value==\"\"){\r\n");
      out.write("\t\t\talert(\"내용을 입력해 주세요.\");\r\n");
      out.write("\t\t\tfrm.contents.focus();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfrm.submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<table cellspacing=\"0\" cellpadding=\"3\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td bgcolor=\"#F5F5F5\"><font size=\"4\"><b>글올리기</b></font></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<form name=\"postFrm\" method=\"post\" action=\"processGuestBook.jsp\">\r\n");
      out.write("\t\t\t<table border=\"1\" bordercolor=\"#000000\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td height=\"40\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/face.bmp\" border=\"0\" alt=\"성명\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t<input title=\"이름을 적어주세요\" name=\"name\" size=\"9\" maxlength=\"20\" value=\"");
      out.print(login.getName() );
      out.write("\" readonly>\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/email.bmp\" border=\"0\" alt=\"메일\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input title=\"전자메일 주소를 적는 곳이군요\" name=\"email\" size=\"20\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmaxlength=\"80\" value=\"");
      out.print(login.getEmail() );
      out.write("\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/hp.bmp\" border=\"0\" alt=\"홈페이지\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t<input title=\"홈페이지도 있으면 알려주세요.\" name=\"hp\" size=\"25\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmaxlength=\"80\" value=\"");
      out.print(login.getHp());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea title=\"좋은 글 남겨주세요\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"contents\" cols=\"60\" rows=\"6\">하이~~~</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"500\" height=\"30\" colspan=\"3\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- table start -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(login.getId().trim());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"글올리기\" onclick=\"javascript:checkInputs()\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"reset\" value=\"고치기\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"secret\" value=\"1\">비밀글\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!--table end  -->\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\t\t");

			GuestBookMgr mgr = new GuestBookMgr();
				Vector<GuestBookBean> vlist = mgr.listGuestBook(login.getId(), login.getGrade());
		
      out.write("\r\n");
      out.write("\t\t<table width=\"520\" cellspacing=\"0\" cellpadding=\"3\">\r\n");
      out.write("\t\t\t<tr bgcolor=\"#F5F5F5\">\r\n");
      out.write("\t\t\t\t<td><font size=\"2\"> <b>");
      out.print(login.getName() );
      out.write("</b>님 환영합니다.\r\n");
      out.write("\t\t\t\t</font></td>\r\n");
      out.write("\t\t\t\t<td align=\"right\"><a href=\"logout.jsp\">로그아웃</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- GuestBook List Start -->\r\n");
	
	if(vlist.isEmpty()){

      out.write("\r\n");
      out.write("\t\t<table width=\"520\" cellspacing=\"0\" cellpadding=\"7\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>등록된 글이 없습니다.</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t");
} else {
			for(int i =0; i<vlist.size();i++)
			{
				GuestBookBean bean = vlist.get(i);
				//방명록 쓴 사람의 정보
				JoinBean writer = mgr.getJoin(bean.getId());
				
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<table  width=\"520\" border=\"1\" bordercolor=\"#000000\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<table bgcolor=\"#F5F5F5\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"225\">NO : ");
      out.print(vlist.size()-i );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"225\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"img/face.bmp\" border=\"0\" alt=\"이름\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"mailto : ");
      out.print(writer.getEmail() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.print(writer.getName() );
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"150\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
if(writer.getHp()==null||writer.getHp().equals("")){
												out.print("홈페이지가 없네요.");
												}else{										
											 
      out.write("\t\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <a href=\"http://");
      out.print(writer.getHp());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t \t<img alt =\"홈페이지\" src=\"img/hp.bmp\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"3\">");
      out.print(bean.getContents() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>IP : ");
      out.print(bean.getIp() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(bean.getRegdate() + " " + bean.getRegtime() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									//로그인 id와 방명록 쓴 사람의 id와 동일하마녀 수정, 삭제 모드 활성화
									boolean chk = login.getId().equals(writer.getId());
									if(chk||login.getGrade().trim().equals("1")){
										if(chk){									
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:updateFn('");
      out.print(bean.getNum());
      out.write("')\">[수정]</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
}//---if2  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"deleteGuestBook.jsp?num=");
      out.print(bean.getNum());
      out.write("\">[삭제]</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

										if(bean.getSecret().trim().equals("1")){
											out.println("비밀글");
										} 
									}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("<!-- Comment List Start -->\r\n");
      out.write("<div id=\"cmt");
      out.print(bean.getNum() );
      out.write("\">\r\n");

	Vector<CommentBean> cvlist = mgr.listComment(bean.getNum());
	mgr.listComment(bean.getNum());
	if(!cvlist.isEmpty()) {	

      out.write("\r\n");
      out.write("\t\t<table width=\"500\" bgcolor=\"#F5F5F5\">\r\n");

		for(int j=0; j<cvlist.size();j++)
		{
			CommentBean cbean = cvlist.get(i);

      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<table width=\"500\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><b>");
      out.print(cbean.getCid() );
      out.write("</b></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t");
if(cbean.getCid().equals(login.getId())){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"commentProc.jsp?flag=delete&cnum=");
      out.print(cbean.getCnum() );
      out.write("\">[삭제]</a>\r\n");
      out.write("\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">");
      out.print(cbean.getComment() );
      out.write("</td> \r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(cbean.getCip() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">");
      out.print(cbean.getCregDate() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<hr/>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
 } //-- for 
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
} //--if	   
      out.write("\t\t\t\r\n");
      out.write("</div>\r\n");
      out.write("<table width=\"500\">\r\n");
      out.write("<tr><td><button onclick=\"disFn('");
      out.print(bean.getNum());
      out.write("')\">댓글");
      out.print(cvlist.size() );
      out.write("</button></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("<!-- Comment List End -->\t\t\t\t\r\n");
      out.write("<!-- Comment Form Start -->\r\n");
      out.write("<form name=\"cFrm\" action=\"commentProc.jsp\">\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><textarea name=\"comment\" cols=\"72\" rows=\"2\"\r\n");
      out.write("\t\t\t\t\t\tmaxlength=\"1000\"></textarea></td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"댓글\" onclick=\"javascript:commentPost(this.form)\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"flag\" value=\"insert\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"num\" value=\"");
      out.print(bean.getNum());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"cid\" value=\"");
      out.print(login.getId());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"cip\" value=\"");
      out.print(request.getRemoteAddr());
      out.write("\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("<!-- Comment Form End -->\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");

			}	//---for
		}//---if

      out.write("\r\n");
      out.write("\t\t<!-- GuestBook List End -->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");

	} //getSession.jsp에 else를 닫는다.

      out.write("\r\n");
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
