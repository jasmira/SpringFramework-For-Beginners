package com.pack1.dao;

import java.util.Collection;
import java.util.List;
import com.pack1.model.Student;

public interface StudentDao {
	public void add(Student s1);

	public void edit(Student s1);

	public void delete(int studentid);

	public Student getStudent(int studentid);

	public Collection getAllStudent();

}
