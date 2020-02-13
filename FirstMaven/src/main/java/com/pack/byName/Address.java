package com.pack.byName;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	
	@Autowired
	Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
public Address()
{
	
}
void display()
{
	System.out.println("address created");
}
void print()
{
	display();
	student.display();
}
}
