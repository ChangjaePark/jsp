<!-- expression2.jsp -->
<%@page import="java.util.Date"%>
<%@ page contentType="text/html; charset=EUC-KR" %>
<%!
	//int a = Math.max(a, b);
	public int max1(int a, int b) {
		 return (a >= b) ? a : b;
	}

%>
<%
	java.util.Date d = new Date();
	int hour = d.getHours();
	int one = 10;
	int two = 12;
	
%>

������ �����ϱ�� �����ϱ��? <%=(hour<12)?"����":"����" %>
</br>
ont = 10�̰� two = 12�̴�.
</br>
one�� two �� �߿� ū ���ڴ�? <%=max1(one,two)%>