package com.tyys.list;

public class Demo1 {
	public static void main(String[] args) {
		Myarraylist list=new Myarraylist(2);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list.get(3));
	}

}
