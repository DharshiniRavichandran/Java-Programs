package Interface;

interface Computer1 {  //here we used interface to generalizing
	public void code();
}

class Desktop2 implements Computer1 {
	public void code() {
		System.out.println("Code-Compile-Run: Faster");
	}
}

class Laptop2 implements Computer1 {
	public void code() {
		System.out.println("Code-Compile-Run");
	}
}

class Developer2 {
	public void devApp(Computer1 com) {
		com.code();
	}
}

public class InterfaceExample3 {

	public static void main(String[] args) {

		Computer1 lap = new Laptop2();
		Computer1 desk = new Desktop2(); //Creating common reference type we can easily access any class methods
		Developer2 dev = new Developer2();
		dev.devApp(lap);

	}

}
