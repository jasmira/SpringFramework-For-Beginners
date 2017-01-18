import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import trans2.*;

public class TransactionTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("transaction.xml");
		TransactionBean bean =(TransactionBean) context.getBean("trBean");
		bean.insertRow(new Member("13", "Ramana"));
	}
}