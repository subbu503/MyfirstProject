package programs;

public class ThisExample {

	int variable = 5;

   	public static void main(String args[]) {
		ThisExample obj = new ThisExample();
		obj.method(20);
		obj.method();
		obj.method3();
	}

	public ThisExample()     //using this in constructor level
	{
		this(20);
		System.out.println("default constructor");
	}
	

	public ThisExample(int a)
	{
		
		System.out.println("parameterized constructor");
	}
	
	
	 
	public void method(int variable) {          //using this at variable level
		variable = 10;
		System.out.println("Value of variable :" + variable);
		System.out.println("Value of variable :" + this.variable);
	}

	void method() {
		int variable = 40;
		System.out.println("Value of variable :" + variable);
		System.out.println("Value of variable :" + this.variable);
	}

	void method3()
	{                             //using this at method level
		this.method4();
		System.out.println("this is method3");
	}
	void method4()
	{
		System.out.println("this is method 4");
	}
}
