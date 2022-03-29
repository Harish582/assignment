package com.tyys.list;
import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		
		List li=new ArrayList();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		System.out.println(li);
		
		list.addAll(li);
		System.out.println(list);
		
		
		List l=new ArrayList();
		l.add(100);
		l.add(200);
		list.removeAll(l);
	     System.out.println(list);
		
		
	}

}

