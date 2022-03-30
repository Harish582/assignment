package com.one.Linkedhashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

import com.one.Hashset.Student;

public class Studentexe {
	public static void main(String[] args) {
		Student a=new Student("harish", 1, "IT", 6383498688l);
		Student b=new Student("mohan", 2, "IT", 6383498688l);
		Student c=new Student("naveen", 3, "IT", 6383498688l);
		Student d=new Student("maddy", 4, "IT", 6383498688l);
		Student e=new Student("mukilan", 5, "IT", 6383498688l);
		
		LinkedHashSet<Student> hashSet = new LinkedHashSet<>();
		hashSet.add(a);
		hashSet.add(b);
		hashSet.add(c);
		hashSet.add(d);
		hashSet.add(e);
		System.out.println(hashSet);
		ArrayList<Student> arrayList = new ArrayList<>(hashSet);
		int choice=0;
		System.out.println("choose ur sorting metjod:\n1.sortbyid\n2.sortbyname");
		System.out.println("enter ur choice:");
		Scanner s=new Scanner(System.in);
		while(true)
		{
			choice=s.nextInt();
			if(choice<=2&&choice>0)
				break;
			else
				System.out.println("give correct choice");
		}
		System.out.println("after sorting");
		switch(choice)
		{
		case 1:SortbyId sortbyid=new SortbyId();
		       Collections.sort(arrayList);
		       break;
		case 2:SortbyName sortbyname=new SortbyName();
	       Collections.sort(arrayList);
	       break;      
		       
		}
		Collections.sort(arrayList);
		System.out.println("after using comprable to sort by id,the set is:");
		Iterator<Student> iterator = arrayList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

}
}	
	
