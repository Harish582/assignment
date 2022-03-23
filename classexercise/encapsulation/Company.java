package com.tyys.encapsulation;

public class Company {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("harish");
		emp.setAge(22);
		emp.setDesignation("Trainee");
		emp.setSalary(2000000);
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getDesignation());
		System.out.println(emp.getSalary());
	}

}
