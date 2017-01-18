package dao;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import dao.PersonRowMapper;
import model.Person;

public class JdbcDaoImpl implements JdbcDao {
	private DataSource dataSource;

	
	@Override
	public void setDataSource(DataSource ds) {
		dataSource = ds;
	}


	@Override
	public void create(String firstName, String lastName) {
		JdbcTemplate insert = new JdbcTemplate(dataSource);
		insert.update("INSERT INTO PERSON1  VALUES(?,?)", new Object[] {
				firstName, lastName });
	}

	@Override
	public List<Person> select(String firstname, String lastname) {
		JdbcTemplate select = new JdbcTemplate(dataSource);
		return select
				.query("select  FIRSTNAME, LASTNAME from PERSON1 where FIRSTNAME = ? AND LASTNAME= ?",
						new Object[] { firstname, lastname },
						new PersonRowMapper());
	}

	@Override
	public List<Person> selectAll() {
		JdbcTemplate select = new JdbcTemplate(dataSource);
		return select.query("select FIRSTNAME, LASTNAME from PERSON1",
				new PersonRowMapper());
	}

	@Override
	public void deleteAll() {
		JdbcTemplate delete = new JdbcTemplate(dataSource);
		delete.update("DELETE from PERSON1");
	}

	@Override
	public void delete(String firstName, String lastName) {
		JdbcTemplate delete = new JdbcTemplate(dataSource);
		delete.update(
				"DELETE from PERSON1 where FIRSTNAME= ? AND LASTNAME = ?",
				new Object[] { firstName, lastName });
	}

	@Override
	public void displayAll() {
		JdbcTemplate display = new JdbcTemplate(dataSource);
		display.query("select FIRSTNAME, LASTNAME from PERSON1",
				new PersonCallbackHandler());
	}

}
