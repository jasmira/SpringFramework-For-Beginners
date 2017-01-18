package com.pack1.service;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pack1.dao.*;
import com.pack1.model.*;

@Service("studentservice")                                    //Service Layer
public class StudentServiceImpl implements StudentService 
{
	@Autowired                                               //spring stereotype annotation
	private StudentDao   studentdao;
	

	@Override
	public void add(Student s1)   // add student record
	{
		studentdao.add(s1);
	}
	
	@Override
	public void edit(Student s1)  //modify  student record
	{
	      studentdao.edit(s1);
	}

	@Override
	public void delete(int studentid)   //remove  student record
	{
	   studentdao.delete(studentid);	
	}
	
	@Override
	public Student  getStudent(int studentid)   //Search student
	{
     		return  studentdao.getStudent(studentid);
	}
		
	@Override
	public Collection getAllStudent()    //All students  records
	{
		return studentdao.getAllStudent();
	}
}
