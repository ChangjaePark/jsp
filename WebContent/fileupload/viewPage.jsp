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
		//파일이 서버에 업로드 되는 시점은 MultipartRequest객체가 만들어지는 시점임..
		MultipartRequest	multi = new MultipartRequest(request,saveFolder,maxSize,encType, new DefaultFileRenamePolicy());
		//fileSelect.jsp에서 업로드할 file의 name과 같아야함! 
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
		저장된 파일 : <%=fileName %><br/>
		실제 파일 :	<%=original %><br/>
		파일 타입 :<%=type	 %><br/>
		파일 크기 : <%=len %>byte<br/>
		user : <%=user %><br/>
		title : <%=title %><br/>
		<a href="fileSelect.jsp">파일 선택</a>
<%
	}catch(Exception e){
		out.println(e.getMessage());
	}
%>


