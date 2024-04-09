package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbCon2 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.printf("JDBC Driver 로드 성공!!");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "ADAM";
			String pw = "1234";
			String sql = "SELECT * FROM EMP";
			conn = DriverManager.getConnection(url, user, pw);
			System.out.printf("DB 연결 성공!!\n");
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			// data 읽어오기
			while(rs.next()) {			// 읽어올 데이터가 있으면 true 없으면 false반환
				String en = rs.getString("ENAME");
				String empno = rs.getString("EMPNO");
				String job = rs.getString("JOB");
				String mrg = rs.getString("MGR");
				String hd = rs.getString("HIREDATE");
				String sal = rs.getString("SAL");
				String comm = rs.getString("COMM");
				String dn = rs.getString("DEPTNO");
				
				System.out.printf("이름: %s, 사번: %s, 업무: %s, 사수: %s, 입사일: %s, 월급: %s, 수당: %s, 부서번호: %s \n", en, empno, job, mrg, hd, sal, comm, dn);
						
				
//				while(rs.next()) {
//		            for (int i = 1; i<=8; i++) {
//		               String in = rs.getString(i);				// 이 방법은 i가 뭔지 알수 없는 구조임
//		               System.out.print(in + " | ");
//		            }
//		            
//		            System.out.println();
//		         }
			}
				
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
//				rs.close();
//				st.close();
				conn.close();
				System.out.printf("DB 연결 해제\n");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
