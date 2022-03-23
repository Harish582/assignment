package com.tyys.objectclass;
import java.util.LinkedList;

public class Demo {

	public String tostring()
	{
		return "0";
	}
	
	public boolean equals (Object obj)
	{
		if(obj instanceof LinkedList<?>) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int hashcode() {
		return 1;
	}
	
	protected void finalise() throws Throwable{
		System.out.println("This is from finalise");
	}
	  
	public static void main(String[] args) {
		Demo a=new Demo();
		System.out.println(a);
		
		Demo demo2=new Demo();
		System.out.println("This is object 2 of demo"+demo2);
		
		a=null;
		Demo demo3=new Demo();
		int hashcode=demo3.hashcode();
		System.out.println(hashcode);
		demo2=null;
		demo3=null;
		System.gc();
	}

}
