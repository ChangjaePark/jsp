<!--  script.jsp -->
<%@ page contentType="text/html; charset=EUC-KR" %>
<%!	//���� ����
	String declaration = "����";

	public String decMEthod()
	{
		return declaration;	
	}

%>
<% //��ũ��Ʈ��

	String scriptlet = "��ũ��Ʈ��";
	String comment = "�ּ�";
	
	//���� ��ü
	out.println("���尴ü�� �̿��� ��� : " + declaration + "<p/>");
%>

������ ���1 : <%= declaration %><p/>
������ ���2 : <%= decMEthod() %><p/>
��ũ��Ʈ���� ��� : <%=scriptlet %><p/>