<!-- teamInsertProc2.jsp -->
<%@ page contentType="text/html; charset=EUC-KR" %>
<%request.setCharacterEncoding("EUC-KR");%>
<!-- TeamMgr mgr = new TeamMgr() -->
<jsp:useBean id="mgr" class="ch07.TeamMgr"/>
<!-- TeamBean mgr1= new TeamBean() -->
<jsp:useBean id="bean" class="ch07.TeamBean"/>
<jsp:setProperty property="*" name="bean"/>

<%
	boolean result = mgr.insertTeam(bean);
	String str = "���� ����";
	String location = "teamInsert.jsp";
	if(result){
		str = "���� ����";
		location = "teamList.jsp";
	}
%>
<script>
		alert("<%=str%>");
		<%--location.href("<%=location%>");--%>
		location.href = "<%=location%>";
</script>