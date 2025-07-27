package Encapsulation;

//Same as method but no return type
//Mainly used to initializing values to the instance variables
//Accessed through creating objects

class ConstructorImplementation {

	private int age;
	private String name;

	public ConstructorImplementation() // Default Constructor
	{
		age = 10;
		name = "Dharshini";
		System.out.println("Age: " + age + " Name: " + name);

	}

	public ConstructorImplementation(int age, String name) // Parameterized constructor
	{

		this.age = age;
		this.name = name;
		System.out.println("Age: " + age + " Name: " + name);

	}

}

public class Constructor {

	public static void main(String[] args) {
		ConstructorImplementation obj1 = new ConstructorImplementation();
		ConstructorImplementation obj2 = new ConstructorImplementation(11, "Ravichandran");

	}

}
