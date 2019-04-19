<%@ page contentType="text/html; charset=EUC-KR" %>
<%
	request.setCharacterEncoding("EUC-KR");
	//세션에 제거
	String sessionId = session.getId();
	session.invalidate();
	String sessionId2 = session.getId();
%>
<script>
	alert("<%=sessionId + " : 로그아웃"%>");
	location.href = "sessionLogin.jsp";
</script>