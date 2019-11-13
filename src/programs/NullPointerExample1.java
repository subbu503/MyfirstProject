package programs;

public class NullPointerExample1 {

	public static NullPointerExample1 nullable;
	
	public static void main(String[] args) 
	
	{
		NullPointerExample1 nullable=new NullPointerExample1();
		
		nullable.method1();
		
		
	}

	public void method1()
	{
		System.out.println("this is my m1 method");
	}
}
