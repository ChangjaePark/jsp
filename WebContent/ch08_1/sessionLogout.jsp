<%@ page contentType="text/html; charset=EUC-KR" %>
<%
	request.setCharacterEncoding("EUC-KR");
	//���ǿ� ����
	String sessionId = session.getId();
	session.invalidate();
	String sessionId2 = session.getId();
%>
<script>
	alert("<%=sessionId + " : �α׾ƿ�"%>");
	location.href = "sessionLogin.jsp";
</script>