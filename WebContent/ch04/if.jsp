<!-- if.jsp -->
<%@ page contentType="text/html; charset=EUC-KR" %>
<% //request : ��û ���� ��ü

	//��ó����� ���� ���� set�� �ѱ۷� ����
	request.setCharacterEncoding("EUC-KR");

	String name = request.getParameter("name");
	String color  = request.getParameter("color");
	String str = "";
	if(color.equals("blue"))
	{
		str = "�Ķ���";
	}
	else if (color.equals("red"))
	{
		str = "������";
	}
	else if(color.equals("orange"))
	{
		str = "��Ȳ��";
	}
	else
	{
		color = "white";
		str = "��Ÿ��";
	}
%>
<!-- �׽�Ʈ<%=name%>:<%=color%> -->

<body bgcolor = "<%=color%>">
<h2><%=name %>���� �����ϴ� ������ <%=str%>�Դϴ�.</h2>
</body>
