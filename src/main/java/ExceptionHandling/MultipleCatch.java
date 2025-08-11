package ExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		int a = 10, b = 2, c;
	    try {   
		c=a/b;
		String name = null;
		System.out.println(name.length());
	    }
	    catch(ArithmeticException e)
	    {
	    	System.out.println("Found an exception called: "+e);
	    }
	    catch(NullPointerException e) {
	    	System.out.println("Found an exception called: "+e);
	    }
	    

	}

}
