package com.one.Linkedhashset;

public class Student implements Comparable<Student> {
	String name;
    int id;
    String department;
    Long mobileno;
	public Student(String name, int id, String department, Long mobileno) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", department=" + department + ", mobileno=" + mobileno + "]";
	}
	public int hashcode()
	{
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student std=(Student)obj;
		return this.name.equals(std.name);
	}
	@Override
	public int compareTo(Student s) {
		
		return this.id-s.id;
	}
	
}
