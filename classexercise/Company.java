package com.tyys.arraylistimp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Company {
	public static void main(String[] args) {
		Employee gokul=new Employee(1,"gokul","trainee",30000);
		Employee harish=new Employee(2,"harish","trainee",30000);
		Employee rajan=new Employee(3,"rajan","trainee",30000);
		Employee vignesh=new Employee(4,"vignesh","trainee",30000);
		Employee sasi=new Employee(5,"sasi","trainee",30000);
		Employee mohan=new Employee(6,"mohan","trainee",30000);
		
		ArrayList<Employee>listofemployees=new ArrayList<>();
		listofemployees.add(vignesh);		
		listofemployees.add(gokul);		
		listofemployees.add(harish);		
		listofemployees.add(rajan);		
		listofemployees.add(sasi);		
		listofemployees.add(mohan);		
		
		/*for(int i=0;i<listofemployees.size();i++)
		{
			System.out.println(Employee.get(i));
		}
		
		for(Employee employee:listofemployees)
		{
			System.out.println(employee);
		}
		
		Iterator<Employee>iterator=listofemployees.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		//vignesh.compareTo(mohan);
		//Collections.sort(Company);
		 //Iterator<Employee>iterator=
		
		SortById sortbyId=new SortById();
		SortByName sortbyname=new SortByName();
		
		Collections.sort(listofemployees,sortbyId);
		Collections.sort(listofemployees,sortbyname);
		Iterator<Employee>iterator=listofemployees.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}
	

}
