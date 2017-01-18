package com.pack1.controller;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.pack1.model.Student;
import com.pack1.service.StudentService;
@Controller                    
public class StudentController  
{
	@Autowired
	private StudentService  studentservice;
	
	@RequestMapping(value="/form",method=RequestMethod.GET)   //Default Method
	public  String  setupForm(Map<String,Object >  map)
	{
    	  Student  student=new  Student();
    	  map.put("student",student);
    	  map.put("studentList",studentservice.getAllStudent());
		  return "student";
	}
	
    @RequestMapping(value= "/student",method=RequestMethod.POST)
	public  String doActions(@ModelAttribute   Student student ,BindingResult result, @RequestParam String  action,Map<String,Object >  map ) //This single method does all four tasks; add, delete, serach and edit
	{
    	Student studentresult=new Student();
		if (action.toLowerCase().equals("add"))
		{
			System.out.println("add selected");
			studentservice.add(student);
			studentresult=student;
			
		}
		if (action.toLowerCase().equals("edit"))
		{
			System.out.println("edit selected");
           studentservice.edit(student);
			studentresult=student;
		}
		if (action.toLowerCase().equals("delete"))
		{
    	    studentservice.delete(student.getStudentId());
			studentresult=new Student();
		}
		if (action.toLowerCase().equals("search"))
		{
    	    Student  searchstudent=studentservice.getStudent(student.getStudentId());
			studentresult=searchstudent!=null ? searchstudent: new Student();
		}
		map.put("student",studentresult);
		map.put("studentList",studentservice.getAllStudent());
		return "student";
	}
}

