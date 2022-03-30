package com.one.Hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Studentexe {
	public static void main(String[] args) {
		Student a=new Student("harish", 1, "IT", 6383498688l);
		Student b=new Student("mohan", 2, "IT", 6383498688l);
		Student c=new Student("naveen", 3, "IT", 6383498688l);
		Student d=new Student("maddy", 4, "IT", 6383498688l);
		Student e=new Student("mukilan", 5, "IT", 6383498688l);
		
		HashSet<Student> hashSet = new HashSet<>();
		hashSet.add(a);
		hashSet.add(b);
		hashSet.add(c);
		hashSet.add(d);
		hashSet.add(e);
		System.out.println(hashSet);
		System.out.println("===============");
		ArrayList<Student> arrayList = new ArrayList<>(hashSet);
		Collections.sort(arrayList);
		Iterator<Student> iterator = arrayList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
