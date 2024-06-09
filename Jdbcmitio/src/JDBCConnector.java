import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCConnector implements JDBCAccess {

	Connection conn = null;
    
	public JDBCConnector() throws Exception {
		connectToDB();
	}

	public boolean connectToDB() throws Exception {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
		} catch (Exception e) {
			System.err.println("ERROR: failed to load HSQLDB JDBC driver!");
			e.printStackTrace();
			return false;
		}
		conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
		System.out.println("Verbunden!");
		return (conn != null);
	}

	public static void main(String[] args) throws Exception {
		JDBCConnector Verbindung = new JDBCConnector();

		Verbindung.connectToDB();

	}

	@Override
	public boolean doInsert(String x) throws Exception {
		if (conn == null) {
			return false;
		}
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(x);
		return true;
	}

	@Override
	public boolean doCreate(String x) throws Exception {
		if (conn == null) {
			return false;
		}
		Statement stmt = conn.createStatement();
		stmt.execute(x);
		return true;
	}

	@Override
	public boolean doAlter(String x) throws Exception {
		if (conn == null) {
			return false;
		}
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(x);
		return true;
	}

	@Override
	public boolean doUpdate(String x) throws Exception {
		if (conn == null) {
			return false;
		}
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(x);
		return true;
	}

	@Override
	public boolean doDelete(String x) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}

