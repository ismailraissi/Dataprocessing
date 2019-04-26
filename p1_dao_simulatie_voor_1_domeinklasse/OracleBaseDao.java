package p1_dao_simulatie_voor_1_domeinklasse;

import java.sql.*;

public class OracleBaseDao {
	private Connection conn;

	protected Connection getConnection() {
		Connection res = null;
		try {
			Connection myConn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "testdb", "test");

			res = myConn;
		} catch (Exception err) {
			err.printStackTrace();
		}
		return conn = res;
	}

	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException err) {
			err.printStackTrace();
		}
	}

}
