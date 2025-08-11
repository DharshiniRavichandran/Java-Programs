package Abstraction;

class A {
	public void methodA() {
		System.out.println("Old Implementation");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		
		//Anonymous Inner class for method overriding
		A obj = new A() {
			public void methodA() {
				System.out.println("New Implementation");
			}
		};
		obj.methodA();

	}

}
