package StaticKeyword;

class StaticImplementation1 {
	// 5th standard A section students details
	int Id;
	String studentName;
	static String std; // this variable is common for all students

	public void show()// non static method. inside non static method we can use static variables
	{
		System.out.println("Id:" + Id + " Name:" + studentName + " Std:" + std);
	}

	public static void show1(StaticImplementation1 st1) // Can't use non static variable directly inside the static
														// method. that's why we passed the object to initializing the
														// values to the variables
	{
		System.out.println("Id:" + st1.Id + " Name:" + st1.studentName + " Std:" + st1.std);
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		StaticImplementation1 st1 = new StaticImplementation1();
		st1.Id = 1;
		st1.studentName = "Dharshini";
		st1.std = "5th std";

		StaticImplementation1 st2 = new StaticImplementation1();
		st2.Id = 2;
		st2.studentName = "Ravichandran";
		st2.std = "5th std";

		st1.show();
		st2.show();

		StaticImplementation1.show1(st1); // Calling static method directly through class name

	}

}
