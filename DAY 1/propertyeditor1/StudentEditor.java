package domain.editor;
import java.beans.*;

import domain.Student;

public class StudentEditor extends PropertyEditorSupport {
	public void setAsText(String data) {
		
		String tokens[] = data.split(",");
				
		Student std = new Student();
		std.setRollNumber(Integer.parseInt(tokens[0]));
		std.setName(tokens[1]);
		std.setMarks(Float.parseFloat(tokens[2]));
		setValue(std);
	}

}

