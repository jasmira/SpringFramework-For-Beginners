package com.pack1.model;

public class Student // Persistence Object
{
	private int studentId;

	private String firstname;

	private String lastname;

	private int marks;

	public Student() {
	}

	public Student(int studentId, String firstname, String lastname, int marks) {

		this.studentId = studentId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}
