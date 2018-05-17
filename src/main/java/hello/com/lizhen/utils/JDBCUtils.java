package hello.com.lizhen.utils;

import java.sql.*;

public class JDBCUtils {

	
	//加载驱动并建立数据库连接
	public static Connection getConnection() throws SQLException,
	ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://139.224.236.0:3306/chapter01";
		String username = "root";
		String password = "Lizhen520";
		Connection conn = DriverManager.getConnection(url, username, password);		
		
		return conn;
	}
	//关闭数据库释放资源
	public static void release(Statement stmt,Connection conn) {
		if (stmt != null) {
			
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			stmt = null;
			
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			conn = null;
		}
	}
	public static void release(ResultSet rs,Statement stmt,Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			rs = null;
		}
		release(stmt, conn);
	}
}
