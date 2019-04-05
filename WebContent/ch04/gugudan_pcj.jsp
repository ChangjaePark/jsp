<!--  cjpark's ggugudan -->
<%@page import="java.util.Random"%>
<%@ page contentType="text/html; charset=EUC-KR" %>
<meta http-equiv="refresh" content="1">
<h2 style = "text-align : center; color:purple;" >Table을 이용하여 구구단 만들기</h2>
<hr style="border:solid 5px purple;">
<table border = "1" cellpadding = "5" bordercolor="green" style = "border-style: solid;  text-align : center; margin:auto">
<%!
	public String randomColor(){
	Random r = new Random();
	String rgb = Integer.toHexString(r.nextInt(256));
		rgb += Integer.toHexString(r.nextInt(256));
		rgb += Integer.toHexString(r.nextInt(256));
		return "#"+rgb;
}
%>
<%
	for(int i = 0; i<10; i++){
		out.println("<tr>");
		for ( int j = 2; j < 10 ; j++)
		{
			if(i == 0){
				%>
				<th >
				<font color="<%=randomColor()%>">
				<%=j%>단</font></th>
<%	}	else	{	%>
			<td>
			<font color="<%=randomColor()%>"><%=j %> X <%=i%> = </font>
			<font color="<%=randomColor()%>"><%=i*j %></font>
			</td>	
<%		
			}//---else
		}//---j_for
	}//---i_for
%>


</table>
