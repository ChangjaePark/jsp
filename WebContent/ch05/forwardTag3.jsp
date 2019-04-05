<!-- forwardTag3.jsp -->
<%@ page contentType="text/html; charset=EUC-KR" %>
<%
	request.setCharacterEncoding("EUC-KR");
	String bloodType = request.getParameter("bloodType");
	String name = "simba222";
%>
<jsp:forward page='<%=bloodType+".jsp"%>'>
	<jsp:param value="simba222" name="name"/>
</jsp:forward>