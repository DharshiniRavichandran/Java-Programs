package Interface;

//*******Kindly compare all three examples so we can easily understand why we need interface*******
class Desktop {
	public void code() {
		System.out.println("Code-Compile-Run: Faster");
	}
}

class Laptop {
	public void code() {
		System.out.println("Code-Compile-Run");
	}
}

class Developer {
	public void devApp(Desktop desk) {
		desk.code();
	}
}

public class InterfaceExample1 {

	public static void main(String[] args) {

		Laptop lap = new Laptop();
		Developer dev = new Developer();
//		dev.devApp(lap);

		Desktop desk = new Desktop();
		dev.devApp(desk);

	}

}
