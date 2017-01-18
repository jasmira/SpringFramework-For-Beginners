package test;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import dao.JdbcDao;
import model.Person;

public final class DaoMain {

	public static void main(String[] args) {
		// MyDao dao = new MyDao();

		ApplicationContext ac = new ClassPathXmlApplicationContext("context.xml");
		// DataSource dataSource = (DataSource) ac.getBean("dataSource");
		// dao.setDataSource(dataSource);
		JdbcDao dao = (JdbcDao) ac.getBean("dao");
		dao.create("Ramana", "Reddy");
		dao.create("Spurti", "Reddy");
		dao.create("Mano", "Kurien");
		dao.create("Sudhir", "Jain");
		dao.create("Anil", "Kumar");
		System.out.println("5 rows inserted");
		System.out.println("\nNow select and list all persons using RowMapper");
		List<Person> list = dao.selectAll();
		for (Person myPerson : list) {
			System.out.print(myPerson.getFirstName() + " ");
			System.out.println(myPerson.getLastName());
		}

		System.out.println("\nNow select persons having the firstname Mano and lastname Kurien");
		list = dao.select("Mano", "Kurien");
		for (Person myPerson : list) {
			System.out.print(myPerson.getFirstName() + " ");
			System.out.println(myPerson.getLastName());
		}

		System.out.println("\nNow list all persons using CallBackhandler");
		dao.displayAll();

		dao.deleteAll();
	}
}
