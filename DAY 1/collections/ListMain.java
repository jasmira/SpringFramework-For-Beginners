package collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListMain {
	public static void main(String[] args) {
		BeanFactory beanfactory = new ClassPathXmlApplicationContext(
				"context.xml");
		CollegeBean coll = (CollegeBean) beanfactory.getBean("collegeBean");
		System.out.println(coll);
		System.out.println(coll.getLists().size());
	}
}
