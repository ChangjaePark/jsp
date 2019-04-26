package board;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardMgr {
	
	private DBConnectionMgr pool;
	public static final String SAVEFOLDER = "C:/Jsp/eclipse-workspace/myapp/WebContent/board/fileupload/";
	public static final String ENCTYPE = "EUC-KR";
	public static int MAXSIZE = 10*1024*1024;
	
	public BoardMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	
	//Board Insert : ���Ͼ��ε�, ContentType
	public void insertBoard(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			//////���Ͼ��δ�//////
			File dir = new File(SAVEFOLDER);
			if(!dir.exists()) {
				dir.mkdirs();//������ ���ٸ� ���Ӱ� ������.
			}
			MultipartRequest multi = new MultipartRequest(req, SAVEFOLDER, MAXSIZE, ENCTYPE, new DefaultFileRenamePolicy());
			String filename = null;
			int filesize = 0;
			if(multi.getFilesystemName("filename")!=null) {
				filename = multi.getFilesystemName("filename");
				filesize = (int)multi.getFile("filename").length();
				
			}
			//////////////////////////////////////////////
			//�Խù� ����(contentType : TEXT, HTML)
			String content = multi.getParameter("content");
			if(multi.getParameter("contentType").equals("TEXT")) {
				content = UtilMgr.replace(content, "<", "&lt;");
			}
			
			//////////////////////////////////////////////
			con = pool.getConnection();
			sql = "select max(num) from tblBoard";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			int ref = 1;
			if(rs.next())
				ref = rs.getInt(1) + 1;//���� ����� num�� 1 �����ؼ� ref���� ����
			//////////////////////////////////////////////
			sql = "insert tblBoard(name,content,subject,ref,pos,depth,regdate,pass,count,ip,filename,filesize) values(?, ?, ?, ?, 0, 0, now(), ?, 0, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, multi.getParameter("name"));
			pstmt.setString(2, content);
			pstmt.setString(3, multi.getParameter("subject"));
			pstmt.setInt(4, ref);
			pstmt.setString(5, multi.getParameter("pass"));
			pstmt.setString(6, multi.getParameter("ip"));
			pstmt.setString(7, filename);
			pstmt.setInt(8, filesize);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return;
	}
	
	//Board Total Count(�� �Խù� ����)
	
	//Board List
	
	//Board Get
	
	//Count Up(��ȸ�� ����)
	
	//Board Delete
	
	//Board Update
	
	//Board Reply
	
	//Board Reply up
	
	//Board Download
	
	//Post 1000
	
	//����¡ �� �� �׽�Ʈ�� ���� �Խù� ���� �޼ҵ� 
		public void post1000(){
			Connection con = null;
			PreparedStatement pstmt = null;
			String sql = null;
			try {
				con = pool.getConnection();
				sql = "insert tblBoard(name,content,subject,ref,pos,depth,regdate,pass,count,ip,filename,filesize)";
				sql+="values('aaa', 'bbb', 'ccc', 0, 0, 0, now(), '1111',0, '127.0.0.1', null, 0);";
				pstmt = con.prepareStatement(sql);
				for (int i = 0; i < 1000; i++) {
					pstmt.executeUpdate();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pool.freeConnection(con, pstmt);
			}
		}
	
	//Main
	public static void main(String[] args)
	{
		BoardMgr mgr = new BoardMgr();
		mgr.post1000();
		System.out.println("����~~");
		
	}
}
