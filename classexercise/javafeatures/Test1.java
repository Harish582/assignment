package javafeatures;

public interface Test1 {
	default void message()
	{
		System.out.println("hello");
	}

}
