import anno.model.Order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("orderbeans.xml");

		Order order = (Order) context.getBean("orderBean");
		System.out.println(order);
	}

}
