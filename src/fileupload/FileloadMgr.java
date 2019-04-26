package fileupload;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import guestbook.CommentBean;

public class FileloadMgr {
	
	public static final String saveFolder = "C:/Jsp/eclipse-workspace/myapp/WebContent/fileupload/filestorage/";
	public static final String enctype="EUC-KR";
	public static final int maxSize = 10*1024*1024;//10MB
	
	private DBConnectionMgr pool;
	
	public FileloadMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	
	//파일 업로드
	public boolean uploadFile(HttpServletRequest req)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			MultipartRequest multi = new MultipartRequest(req, saveFolder,maxSize,enctype,new DefaultFileRenamePolicy());
			String upFile = multi.getFilesystemName("upFile");
			File f = multi.getFile("upFile");
			int size = (int)f.length();
			con = pool.getConnection();
			sql = "insert tblfileload(upFile,size)values(?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, upFile);
			pstmt.setInt(2, size);
			if(pstmt.executeUpdate()==1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	//파일 리스트
	public Vector<FileloadBean>listFile(){
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<FileloadBean> vlist = new Vector<FileloadBean>();
		try {
				con = pool.getConnection();
				sql = "select * from tblfileload";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
			while(rs.next())
			{
				FileloadBean bean = new FileloadBean();
				bean.setNum(rs.getInt(1));
				bean.setUpFile(rs.getString(2));
				bean.setSize(rs.getInt(3));
				vlist.addElement(bean);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	//파일 삭제
	public void deleteFile(int num[])
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			con = pool.getConnection();
			for(int i = 0 ; i < num.length; i++) {
				sql = "select upFile from tblfileload where num=? ";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, num[i]);
				rs = pstmt.executeQuery();
				if(!rs.next())	
					continue;//for문 i++바로감. 밑에 코드 실행 안됨..
				String upFile = rs.getString(1);
				File f = new File(saveFolder +upFile);
				if(f.exists())//파일이 존재 한다면
				{
					f.delete();	//파일을 삭제하라
				}
				sql = "delete from tblfileload where num=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, num[i]);
				pstmt.executeUpdate();
			}//for
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt,rs);
		}
		return;
	}
}
