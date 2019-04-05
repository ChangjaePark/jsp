<%@ page contentType="text/html; charset=EUC-KR"
		buffer = "5kb" %>
<%
	request.setCharacterEncoding("EUC-KR");
	int totalBuffer = out.getBufferSize();
	int remainBuffer = out.getRemaining();
	int useBuffer = totalBuffer - remainBuffer;
%>
출력 Buffer의 크기 : <%=totalBuffer%>byte<br/>
남은 Buffer의 크기 : <%=remainBuffer%>byte<br/>
사용 Buffer의 크기 : <%=useBuffer%>byte<br/>