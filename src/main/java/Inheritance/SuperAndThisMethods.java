package Inheritance;
//Single Inheritance
//These two methods are used to access the constructors of the super and subclass
class A
{
	public A()
	{
	 System.out.println("In A default constructor");	
	}
	public A(int a) {
		this();
		System.out.println("In A parameterized constructor");
	}
}
class B extends A{
	public B()
	{   
		super(10); //Calls A parameterized constructor
		System.out.println("In B default constructor");	
	}
	public B(int a) {
		
		this(); // calls the B default constructor
		System.out.println("In B parameterized constructor");
	}
}

public class SuperAndThisMethods {

	public static void main(String[] args) {
		
		B obj = new B(4);
		
	}

}
