<!-- cookieLoginProc.jsp -->
<%@ page contentType="text/html; charset=EUC-KR" %>
<%
	request.setCharacterEncoding("EUC-KR");
	// id, pwd
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	boolean result = true;//DB���� ���Ŀ�...
	if(result) {
		Cookie cookie = new Cookie("idKey",id);
		Cookie cookie_pwd = new Cookie("pwdKey",id);
		response.addCookie(cookie);
		response.addCookie(cookie_pwd);
	
%>
	<script>
		alert("�α��� �����Ͽ����ϴ�.")
		location.href = "cookieLoginOK.jsp";
	</script>
<%	}else{	%>
	<script>
		alert("�α��� �����Ͽ����ϴ�.")
		location.href = "cookieLogin.jsp";
	</script>
<%
	}
%>