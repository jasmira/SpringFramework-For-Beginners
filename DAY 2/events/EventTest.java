import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.event.Publisher;

public class EventTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("event.xml");
		Publisher p = (Publisher) context.getBean("publisher");
		p.show();
	}
}