package ch07;

import java.sql.Connection;
import java.sql.PreparedStatement;

/*
 * DB와 관련된 기능의 메소드를 선언한 클래스
 */

public class TeamMgr {

	private DBConnectionMgr pool;
	
	public TeamMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	
	//Insert
	public boolean insertTeam(TeamBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean flag = false;
		String sql;
		try {
			con = pool.getConnection();
			sql = "insert tblTeam(name,city,age,team) values(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			// ? 세팅해야함
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getCity());
			pstmt.setInt(3, bean.getAge());
			pstmt.setString(4, bean.getTeam());
			int cnt = pstmt.executeUpdate();
			if(cnt ==1) 	flag = true;

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con,pstmt);
		}
		
		return flag;
		
	}
	
	//Select
	
	//Get
	
	//Update
	
	//Delete
}
