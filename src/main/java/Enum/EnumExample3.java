package Enum;

//Switch and else if statements using enum

enum Status1 {
	Running, Failed, Pending, Success;
}

public class EnumExample3 {

	public static void main(String[] args) {
		Status1 s = Status1.Pending;
		if (s == Status1.Running) {
			System.out.println("All good");
		} else if (s == Status1.Failed) {
			System.out.println("Try Again");
		} else if (s == Status1.Pending) {
			System.out.println("Please wait");
		} else {
			System.out.println("Done");
		}

		switch (s) {
		case Running:
			System.out.println("All good");
			break;
		case Failed:
			System.out.println("Try Again");
			break;
		case Pending:
			System.out.println("Please wait");
			break;
		default:
			System.out.println("Done");
			break;
		}
	}

}
