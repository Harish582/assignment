package javafeatures;

public class Demo implements Test,Test1 {

	@Override
	public void message() {
		// TODO Auto-generated method stub
		Test.super.message();
		//System.out.println("welcome");
	}

}
