<%@ page contentType="text/html; charset=EUC-KR"
		buffer = "5kb" %>
<%
	request.setCharacterEncoding("EUC-KR");
	int totalBuffer = out.getBufferSize();
	int remainBuffer = out.getRemaining();
	int useBuffer = totalBuffer - remainBuffer;
%>
��� Buffer�� ũ�� : <%=totalBuffer%>byte<br/>
���� Buffer�� ũ�� : <%=remainBuffer%>byte<br/>
��� Buffer�� ũ�� : <%=useBuffer%>byte<br/>