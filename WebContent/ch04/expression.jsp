<!-- expression.jsp -->
<%@ page contentType="text/html; charset=EUC-KR" %>
<%!	//������ ��Ģ : �迭 �ؿ��� �׻� for���� �׻� ����
	String study[] = {"JAVA", "JSP","Servlet","Android"};
%>
<table border = "1" width = "200">
	<tr>
		<th>��ȣ</th>
		<th>����</th>
	</tr>
	<%
		for(int i = 0 ; i <study.length;i++)
		{
	%>  <!--  html�ڵ带 �ֱ����� ���� -->
		<tr>
			<td><%=i+1%>		</td>
			<td><%=study[i]%></td>
		</tr>
	<!--  html�ڵ带 �ֱ����� ���� -->
	<%
	}
	%>
	<!--  html�ڵ带 �ֱ����� ���� -->
</table>


<hr>
<table border = "1" width = "200">
<tr>
		<th>��ȣ</th>
		<th>����</th>
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
