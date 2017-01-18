package dao;

import model.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonRowMapper implements RowMapper<Person> {

	public Person mapRow(ResultSet rs, int line) throws SQLException {
		Person person = new Person();
		person.setFirstName(rs.getString(1));
		person.setLastName(rs.getString(2));
		return person;
	}

}
