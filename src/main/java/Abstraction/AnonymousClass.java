package Abstraction;

class A {
	public void methodA() {
		System.out.println("Old Implementation");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		A obj = new A() {
			public void methodA() {
				System.out.println("New Implementation");
			}
		};
		obj.methodA();

	}

}
