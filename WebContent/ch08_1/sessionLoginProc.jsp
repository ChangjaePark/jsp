<%@page import="ch08.RegisterMgr"%>
<%@ page contentType="text/html; charset=EUC-KR" %>
<jsp:useBean id="mgr" class="ch08.RegisterMgr"/>
<%
	request.setCharacterEncoding("EUC-KR");
	// id, pwd�� ��û�޾Ƽ� loginRegister �޼ҵ带 ȣ���Ͽ�
	// �����̸� sessionLoginOK.jsp�� ������
	// �����ϸ� sessionLogin.jsp�� ������
	
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	boolean result = mgr.loginRegister(id, pwd);
	String msg = "�α��ε��� �ʾҽ��ϴ�.";
	String location = "sessionLogin.jsp";
		if(result){
			msg = "�α��� ����";
			location = "sessionLoginOK.jsp";
			session.setAttribute("idKey", id);
		}
%>

	<script>
		alert("<%=msg%>");
		location.href=  "<%=location%>";
 	</script> 


	
	

	

