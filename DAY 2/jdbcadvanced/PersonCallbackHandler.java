package dao;

import org.springframework.jdbc.core.RowCallbackHandler;
import java.sql.*;

public class PersonCallbackHandler implements RowCallbackHandler {

	public void processRow(ResultSet rs) throws SQLException {
		System.out.println("Name : " + rs.getString(1) + " " + rs.getString(2));
	}
}
