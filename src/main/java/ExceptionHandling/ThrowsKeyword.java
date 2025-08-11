package ExceptionHandling;

class A{
	public void show() throws ClassNotFoundException {
		Class.forName("Pickle");
	}
}

public class ThrowsKeyword {
	
	static {
		System.err.println("Class loaded");
	}

	public static void main(String[] args) {
	
       A obj = new A();
       try {
		obj.show();
	} catch (ClassNotFoundException e) {
        System.out.println("");
	}
	}

}
