package javafeatures;

public interface Test {
	default void message()
	{
		System.out.println("hi");
	}

}
