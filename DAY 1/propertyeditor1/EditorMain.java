import org.springframework.beans.BeanWrapperImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.College;
import domain.Student;
import domain.editor.StudentEditor;



public class EditorMain {
	
	public static void main(String[] args) {

		
	// Using XML file
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("editor.xml");
		//College college = (College) ctx.getBean("college");
		
	//using BeanWrapper
		BeanWrapperImpl wrapper = new BeanWrapperImpl(new College());
		wrapper.registerCustomEditor(Student.class,new StudentEditor());
		wrapper.setPropertyValue("student","100,Siddarth,25");
		
		College college = (College)wrapper.getWrappedInstance();
		System.out.println(college);
	}
}
