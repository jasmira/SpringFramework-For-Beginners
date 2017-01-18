import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.*;
import org.springframework.validation.beanvalidation.*;
import validation.*;
import java.util.*;

public class ValidationMain {

	public static void main(String[] args) {
		BeanFactory beanfactory = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person) beanfactory.getBean("person");
		BindException errors = new BindException(person,"person");
		PersonValidator validator = new PersonValidator();
		validator.validate(person, errors);
		
		if(errors.hasErrors()){
			for (FieldError error : (List<FieldError>) errors.getFieldErrors()) {
				System.out.println("invalid value for: '" + error.getField() + "': " +
						 error.getDefaultMessage());
				}
		}
		else
			System.out.println(person);

	}

}
