package ExceptionHandling;

class MyException extends Exception {
	String string;
	public MyException(String string) {
		super(string);
		this.string =string;
		
	}

}

public class CustomException {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 0;
		// try block
		try {
			c = a / b;
			if (c == 0) { // If the value of C is 0, we have to call the catch block
				throw new MyException("/ by bigger numbber");
				
			}
		}
		// catch block
		catch (MyException e) {
			c = a / 1;
			System.out.println("Found an exception called: " + e);
		}
		System.out.println(c);

	}
}
