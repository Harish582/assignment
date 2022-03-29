package com.one.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import com.tyys.arraylistimp.SortById;

public class College {
	public static void main(String[] args) {
		Student student = new Student("harish", 1, "IT");
		Student student1 = new Student("naveen", 2, "IT");
		Student student2 = new Student("maddy", 3, "IT");
		Student student3 = new Student("mohan", 4, "IT");
		Student student4 = new Student("harish", 5, "IT");
		
		HashSet<Student> hashSet = new HashSet<>();
		hashSet.add(student);
		hashSet.add(student1);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(student4);
		 
		//Iterator<Student> iterator = hashSet.iterator();
		//while(iterator.hasNext())
		//{
		//	System.out.println(iterator.next());
		//}
		//for(Student std:hashSet)
		//{
		//	System.out.println(std);
		//}
		 
		ArrayList<Student> arraylist=new ArrayList<>(hashSet);
		Collections.sort(arraylist,new SortByName());
		for(Student stud:arraylist)
		{
			System.out.println(stud);
		}
		
		
		
		
	}

}
