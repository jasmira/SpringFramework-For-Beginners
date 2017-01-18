package com.pack1.service;

import java.util.Collection;
import java.util.List;
import com.pack1.model.*;

public interface StudentService 
{
		  public   void add(Student  s1);
		   public   void edit(Student  s1);
		   public   void delete(int studentid);
		   public   Student getStudent(int studentid);
		   public Collection  getAllStudent();	
}


