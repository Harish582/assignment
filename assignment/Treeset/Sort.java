package com.one.Treeset;

import java.util.TreeSet;

import com.one.Hashset.Student;

public class Sort {
	public static void main(String[] args) {
		Student a=new Student("harish", 1, "IT", 6383498688l);
		Student b=new Student("mohan", 2, "IT", 6383498688l);
		Student c=new Student("naveen", 3, "IT", 6383498688l);
		Student d=new Student("maddy", 4, "IT", 6383498688l);
		Student e=new Student("mukilan", 5, "IT", 6383498688l);
		
		TreeSet<Student> treeSet = new TreeSet<>();
		treeSet.add(a);
		treeSet.add(b);
		treeSet.add(c);
		treeSet.add(d);
		treeSet.add(e);
		System.out.println(treeSet);
	}
	
}
