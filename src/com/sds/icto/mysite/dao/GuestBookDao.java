package com.sds.icto.mysite.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sds.icto.mysite.vo.GuestBookVo;
import com.sds.icto.mysite.vo.MemberVo;

public class GuestBookDao {
	private Connection getConnection() throws ClassNotFoundException,
			SQLException {
		Connection conn = null;
		// 1. 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2. connection 생성
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		conn = DriverManager.getConnection(dbURL, "webdb", "webdb");

		return conn;
	}

	public void insert(GuestBookVo vo) throws SQLException, ClassNotFoundException {
		// 1. Connection 생성
		Connection conn = getConnection();

		// 2. Statement 준비, SQL문 날리기
		String sql = " insert into member values(guestbook_seq.nextval, ?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		// 3. binding
		pstmt.setString(1, vo.getName());
		pstmt.setString(2, vo.getEmail());
		pstmt.setString(3, vo.getPassword());

		// 4. query 실행
		pstmt.executeUpdate();
		// 5. 자원정리
		pstmt.close();
		conn.close();
	}
}
