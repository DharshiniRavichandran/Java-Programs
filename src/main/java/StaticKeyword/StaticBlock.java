package StaticKeyword;

class StaticBlockImplementation {

	int id;
	String studentName;
	static String std;
	static String section;

	static {
		std = "5th std";
		section = "A section";
	}

	public StaticBlockImplementation() {
		id = 10;
		studentName = "Dharshini";
		System.out.println("Id:" + id + " Name:" + studentName + " Std:" + std + " section:" + section);
	}

}

public class StaticBlock {

	public static void main(String[] args) {

		// Here the static block will be executed first.
		StaticBlockImplementation obj = new StaticBlockImplementation();

	}

}
