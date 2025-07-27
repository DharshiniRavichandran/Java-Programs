package Polymorphism;

//Here we used upcasting to call the overridden methods
class SuperClass{
	public int sum(int a, int b)
	{
		return a+b;
	}
}
class SubClass extends SuperClass{
	public int sum(int a, int b)
	{
		return a+b;
	}
}

public class MethodOverriding {
	

	public static void main(String[] args) {
		
		SuperClass obj1 = new SuperClass();
		int result1 = obj1.sum(10, 8);
		System.out.println(result1);
		
		SuperClass obj2 = new SubClass();
		int result2 = obj1.sum(10, 8);
		System.out.println(result2);
	
	}

}
