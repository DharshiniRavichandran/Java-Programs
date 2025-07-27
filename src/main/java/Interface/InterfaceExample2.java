package Interface;

class Computer {
	public void code() {

	}
}

class Desktop1 extends Computer {
	public void code() {
		System.out.println("Code-Compile-Run: Faster");
	}
}

class Laptop1 extends Computer {
	public void code() {
		System.out.println("Code-Compile-Run");
	}
}

class Developer1 {
	public void devApp(Computer com) {
		com.code();
	}
}

public class InterfaceExample2 {

	public static void main(String[] args) {

		Computer lap = new Laptop1();
		Computer desk = new Desktop1(); //Creating common reference type we can easily access any class methods
		Developer1 dev = new Developer1();
		dev.devApp(lap);

	}

}
