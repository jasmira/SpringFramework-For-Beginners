package trans2;

import org.springframework.jdbc.core.JdbcTemplate ;
import org.springframework.jdbc.core.RowMapper; 
import org.springframework.transaction.annotation.Transactional;

public class TransactionBean {
	JdbcTemplate jdbcTemplate;
	
	private static final String insert_sql = "INSERT into member(id,name) VALUES(?,?)" ;

	
	public JdbcTemplate getJdbcTemplate() {
		
		return jdbcTemplate ;
		
	}
	
	public void setJdbcTemplate(JdbcTemplate template) {
		
		jdbcTemplate = template ;
		
	}
	
	@Transactional
	public void insertRow(Member member) {
		
		JdbcTemplate jt = getJdbcTemplate() ;
		
		Object[] params = new Object[] {member.getId(),member.getName()} ;
		
		int ret = jt.update(insert_sql, params) ;
		
		//throw new RuntimeException("Simulate an error condition") ;
		
	}
	
}
