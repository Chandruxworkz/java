import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcMySqlConncetion {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://Localhost:3306", "root", "Ajay@1234");
		System.out.println(connection);

	}

}
