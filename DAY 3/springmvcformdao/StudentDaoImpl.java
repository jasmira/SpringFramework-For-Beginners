package com.pack1.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pack1.model.Student;

@Service("studentdao")
public class StudentDaoImpl implements StudentDao
{
	
	HashMap<Integer,Student> data = new HashMap<Integer,Student>();
	
	public StudentDaoImplDummy(){
		data.put(100,new Student(100,"Ramana","Reddy",12));
	}
	
	public void add(Student s1)
	{
	       data.put(s1.getStudentId(),s1);
	}

	@Override
	public void edit(Student  s1)
	{
		data.put(s1.getStudentId(),s1);		
	}
	
	@Override
	public void delete(int studentid)
	{
		data.remove(studentid);
	}
	
	@Override
	public Student getStudent(int studentid) 
	{
		return    data.get(studentid);
	}
	
	@Override
	public Collection  getAllStudent() 
	{
		     return  data.values();
	}
}
