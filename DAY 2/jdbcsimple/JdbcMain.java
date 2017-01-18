package jdbc;

import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.*;


public class JdbcMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml");
	    DataSource dataSource = (DataSource) ac.getBean("dataSource");
	
	    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);	
	    
	//  jdbcTemplate.execute("insert into person values(3,'Spurti','Reddy','Hyderabad','500032','AP')");
	  
	    Map m = jdbcTemplate.queryForMap("select * from person where id = 1");
	    System.out.println("Name : " + m.get("firstname")+" "+m.get("lastname"));
	    System.out.println("City : " + m.get("city"));
	    System.out.println("PinCode : " + m.get("pincode"));
	    System.out.println("State : " + m.get("state"));
	    
	    List  l =jdbcTemplate.queryForList("select * from person");
	    Iterator it = l.iterator();
	    while(it.hasNext()){
	    	m =(Map)it.next();
	    	System.out.println(m.get("id") +" "+m.get("firstname")+ " "+m.get("lastname")+" "+m.get("city"));
	    }
	    
	}

}