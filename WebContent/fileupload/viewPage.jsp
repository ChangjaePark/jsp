<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page contentType="text/html; charset=EUC-KR" %>
<%
	request.setCharacterEncoding("EUC-KR");
	final String saveFolder = "C:/Jsp/eclipse-workspace/myapp/WebContent/fileupload/filestorage/"	;
	final String encType = "EUC-KR";
	final int maxSize = 10*1024*1024;//10MB
	
	try{
		//������ ������ ���ε� �Ǵ� ������ MultipartRequest��ü�� ��������� ������..
		MultipartRequest	multi = new MultipartRequest(request,saveFolder,maxSize,encType, new DefaultFileRenamePolicy());
		//fileSelect.jsp���� ���ε��� file�� name�� ���ƾ���! 
		String fileName = multi.getFilesystemName("uploadFile");
		String original = multi.getOriginalFileName("uploadFile");
		String type= multi.getContentType("uploadFile");
		File f = multi.getFile("uploadFile");
		int len = 0;
		if(f!=null)
		{
			len=(int)f.length();
		}
		String user = multi.getParameter("user");  
		String title = multi.getParameter("title");
%>
		����� ���� : <%=fileName %><br/>
		���� ���� :	<%=original %><br/>
		���� Ÿ�� :<%=type	 %><br/>
		���� ũ�� : <%=len %>byte<br/>
		user : <%=user %><br/>
		title : <%=title %><br/>
		<a href="fileSelect.jsp">���� ����</a>
<%
	}catch(Exception e){
		out.println(e.getMessage());
	}
%>


