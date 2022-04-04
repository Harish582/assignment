package com.finalassessment.one;

import java.util.*;


public class Main {
	public void addStudent(ArrayList<Student>arrayList) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give student id,student name,student marks,student course");
		int id=sc.nextInt();
		String name=sc.next();
		double marks=sc.nextDouble();
		String course=sc.next();
		Student student = new Student(id, name, marks, course);
		arrayList.add(student);
		System.out.println(arrayList);
		
	}
	public void EditStudent(ArrayList<Student>arrayList)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of student to edit that particular student");
		int id=sc.nextInt();
		System.out.println("1.name\n2.marks\n3.course");
		int choice2=sc.nextInt();
		switch(choice2)
		{
		case 1:{
			System.out.println("Enter the name: ");
			String name1=sc.next();
			for(Student student:arrayList)
			{
				if(id==student.id)
				{
					student.name=name1;
				}
			}
			break;
		}
		case 2:{
			System.out.println("Enter the marks:");
			double marks1=sc.nextDouble();
			for(Student student:arrayList)
			{
				if(id==student.id)
				{
					student.marks=marks1;
				}
			}
			break;
		}
		case 3:{
			System.out.println("Enter the course:");
			String course1=sc.next();
			for(Student student:arrayList)
			{
				if(id==student.id)
				{
					Student.course=course1;
				}
			}
			break;
		}
		}
	}
	public void DeleteStudent(ArrayList<Student>arrayList)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of student to delete that particular student");
		int id=sc.nextInt();
		for(Student std :arrayList)
		{
			if(id==std.id) {
				arrayList.remove(std);
				break;
			}
		}
	}
	
		
	public void list(ArrayList<Student>arrayList)
	{
		System.out.println("list of students");
		for(Student std:arrayList)
		{
			System.out.println(std);
		}
	}
	
	public void get(ArrayList<Student>arrayList)
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the id of student to get that particular student ");
		  int id=sc.nextInt();
		   for(Student stu:arrayList)
		   {
			   if(id==stu.id)
			   {
				   System.out.println(stu);
			   }
		   }
	}

	public void sort(ArrayList<Student>arrayList)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("sort the list of students");
		System.out.println("1.sortbyId\n2.SortbyName\n3.sortbyMarks");
		int choice3=sc.nextInt();
		switch(choice3)
		{
		case 1:{
			SortById sortById = new SortById();
			Collections.sort(arrayList,sortById);
			System.out.println("Sorted by Id is successfull");
			break;
		}
		case 2:
		{
			SortByName sortByName = new SortByName();
			Collections.sort(arrayList,sortByName);
			System.out.println("sorted by name is Successfull");
			break;
		}
		case 3:	
		{
			SortByMarks sortByMarks = new SortByMarks();
			Collections.sort(arrayList,sortByMarks);
			System.out.println("sort by marks is Successfull");
			break;
		}
		}
		
	}
	
	
	public static void main(String[] args) {
		Main m = new Main();
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		while(true)
		{
			System.out.println("1.Add student\n2.Edit student\n3.Delete student\n4.List of students\n5.Get student\n6.sort the list of students\n7.Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:{
				m.addStudent(arrayList);
				break;
			}
			
			case 2:{
				m.EditStudent(arrayList);
				break;
			}
			case 3:{
				m.DeleteStudent(arrayList);
				break;
			}
			case 4:{
				m.list(arrayList);
				break;
			}
					
			case 5:{
				   m.get(arrayList);
				   break;
				   }
			case 6:{
				m.sort(arrayList);
				break;
			}
			       
			case 7:System.out.println("========Exit the process======");	
				   return;
			default:System.out.println("Invalid Input");
			}
		}
	}
}
