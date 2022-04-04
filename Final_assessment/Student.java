package com.finalassessment.one;

public class Student {
	int id;
	String name;
	double marks;
    static String course;
	
	
	public Student(int id, String name, double marks, String course) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}
}
