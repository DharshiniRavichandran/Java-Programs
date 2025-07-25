package StaticKeyword;

class StaticMethodImplementation {
	// 5th standard A section students details
	int Id;
	String studentName;
	static String std; // this variable is common for all students

	public void show()// non static method. inside non static method we can use static variables
	{
		System.out.println("Id:" + Id + " Name:" + studentName + " Std:" + std);
	}
}

public class StaticVariable {

	public static void main(String[] args) {

		StaticMethodImplementation st1 = new StaticMethodImplementation();
		st1.Id = 1;
		st1.studentName = "Dharshini";
		st1.std = "5th std";

		StaticMethodImplementation st2 = new StaticMethodImplementation();
		st2.Id = 2;
		st2.studentName = "Ravichandran";
		st2.std = "5th std";

		st1.show();
		st2.show();

		st1.std = "6th std"; // here std was changed using st1. so it affects st2 as well.
		System.out.println("It affects all objects");
		st1.show();
		st2.show();

	}

}
