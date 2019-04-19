<!-- cookieLoginProc.jsp -->
<%@ page contentType="text/html; charset=EUC-KR" %>
<%
	request.setCharacterEncoding("EUC-KR");
	// id, pwd
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	boolean result = true;//DB연동 추후에...
	if(result) {
		Cookie cookie = new Cookie("idKey",id);
		Cookie cookie_pwd = new Cookie("pwdKey",id);
		response.addCookie(cookie);
		response.addCookie(cookie_pwd);
	
%>
	<script>
		alert("로그인 성공하였습니다.")
		location.href = "cookieLoginOK.jsp";
	</script>
<%	}else{	%>
	<script>
		alert("로그인 실패하였습니다.")
		location.href = "cookieLogin.jsp";
	</script>
<%
	}
%>