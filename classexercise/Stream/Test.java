package com.one.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Employee> asList = Arrays.asList(new Employee("harish", 1,"trainee", 300000),new Employee("naveen", 2, "trainee", 30000),new Employee("mohan", 3,"trainee", 30000),new Employee("maddy", 4,"trainee", 30000),new Employee("mukilan", 5,"trainee", 30000));
		Stream<Employee> stream = asList.stream();
		Comparator<Employee> com=(o1,o2)->{
			return (int)(o1.getSalary()-o2.getSalary());
		};
		
		Optional<Employee> max2 = stream.max(com);
		System.out.println(max2);
		
		asList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
		
	}

}
