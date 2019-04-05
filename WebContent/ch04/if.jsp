<!-- if.jsp -->
<%@ page contentType="text/html; charset=EUC-KR" %>
<% //request : 요청 내장 객체

	//요처오디는 값의 문자 set을 한글로 설정
	request.setCharacterEncoding("EUC-KR");

	String name = request.getParameter("name");
	String color  = request.getParameter("color");
	String str = "";
	if(color.equals("blue"))
	{
		str = "파란색";
	}
	else if (color.equals("red"))
	{
		str = "빨강색";
	}
	else if(color.equals("orange"))
	{
		str = "주황색";
	}
	else
	{
		color = "white";
		str = "기타색";
	}
%>
<!-- 테스트<%=name%>:<%=color%> -->

<body bgcolor = "<%=color%>">
<h2><%=name %>님이 좋아하는 색깔은 <%=str%>입니다.</h2>
</body>
