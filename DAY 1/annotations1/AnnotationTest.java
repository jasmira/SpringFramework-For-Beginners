import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.WriterService;


public class AnnotationTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BeanFactory factory = context;
		WriterService test = (WriterService) factory.getBean("writerService");
		test.run();
	}
}
