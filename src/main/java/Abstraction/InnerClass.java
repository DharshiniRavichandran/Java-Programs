package Abstraction;

class Outer {
	public void outerMethod1() {
		System.out.println("Outer1 Method");
	}

	public void outerMethod2() {
		System.out.println("Outer2 Method");
	}

	public void outerMethod3() {
		System.out.println("Outer3 Method");
	}

	// Inner classes
	class Inner1 {
		public void innerMethod1() {
			System.out.println("Inner1 Method");
		}
	}

	static class Inner2 {
		public void innerMethod2() {
			System.out.println("Inner2 Method");
		}
	}

	class Inner3 {
		public void innerMethod3() {
			outerMethod2();
			System.out.println("Inner3 Method");
		}
	}

	static class Inner4 {
		public void innerMethod4(Outer out) {
			out.outerMethod3();
			System.out.println("Inner4 Method");
		}
	}

}

public class InnerClass {

	public static void main(String[] args) {

		Outer obj = new Outer();
		obj.outerMethod1();

		// When inner class is non static
		Outer.Inner1 obj1 = obj.new Inner1();
		obj1.innerMethod1();

		// When inner class is static
		Outer.Inner2 obj2 = new Outer.Inner2();
		obj2.innerMethod2();

		// When inner class is non static and want to call outer class methods inside
		// the inner class
		Outer.Inner3 obj3 = obj.new Inner3();
		obj3.innerMethod3();

		// When inner class is static and want to call outer class methods inside the
		// inner class
		Outer.Inner4 obj4 = new Outer.Inner4();
		obj4.innerMethod4(obj);

	}

}
