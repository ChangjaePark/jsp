<!-- expression.jsp -->
<%@ page contentType="text/html; charset=EUC-KR" %>
<%!	//무조건 법칙 : 배열 밑에는 항상 for문이 항상 존재
	String study[] = {"JAVA", "JSP","Servlet","Android"};
%>
<table border = "1" width = "200">
	<tr>
		<th>번호</th>
		<th>과목</th>
	</tr>
	<%
		for(int i = 0 ; i <study.length;i++)
		{
	%>  <!--  html코드를 넣기위해 닫음 -->
		<tr>
			<td><%=i+1%>		</td>
			<td><%=study[i]%></td>
		</tr>
	<!--  html코드를 넣기위해 닫음 -->
	<%
	}
	%>
	<!--  html코드를 넣기위해 닫음 -->
</table>


<hr>
<table border = "1" width = "200">
<tr>
		<th>번호</th>
		<th>과목</th>
	</tr>
	<%
		for(int i = 0;i<study.length;i++)
		{
			out.println("<tr>");
			out.println("<td>" +(i+1)+"</td>");
			out.println("<td>"+study[i]+"</td>");
			out.println("</tr>");
				}
	%>  
</table>
