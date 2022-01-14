package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * ��¥ : 2022/01/13
 * �̸� : ����ȣ
 * ���� : �ڹ� JDBC Select �ǽ��ϱ� ���� p557
 */
public class Sub5_SelectTest {
	public static void main(String[] args) {
		
		// DB ����
		final String HOST = "jdbc:mysql://54.180.160.240:3306/rkdxogh1987";
		final String USER = "rkdxogh1987";
		final String PASS = "1234";
		
		try {
			
			//1�ܰ� - JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
			//2�ܰ� - �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			//3�ܰ� - SQL���� ��ü ����(Statement)
			Statement stmt = conn.createStatement();
			
			//4�ܰ� - ���ó��(SELECT�� ���)
			String sql = "SELECT * FROM `User1`;";
			ResultSet rs = stmt.executeQuery(sql);
			
			//5�ܰ� - �����ͺ��̽�����
			while(rs.next()) {
				
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				System.out.println("=================");
				System.out.println("���̵� : "+uid);
				System.out.println("�̸� : "+name);
				System.out.println("�޴��� : "+hp);
				System.out.println("���� : "+age);
				System.out.println("-----------------");
				
			}
			
			//6�ܰ� - �����ͺ��̽� ����
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Selcet �Ϸ�...");
	}

}