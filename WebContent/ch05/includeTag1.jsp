<!-- includeTag1.jsp -->
<%@ page contentType="text/html; charset=EUC-KR" %>
<%
	request.setCharacterEncoding("EUC-KR");
	String name = request.getParameter("name");
%>
<%-- 이름 : <%=name%> --%>
<!-- include 요청 정보도 같이 넘어감 -->
<jsp:include page="includeTag2.jsp"/>

