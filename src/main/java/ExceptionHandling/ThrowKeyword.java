package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		int a = 10, b = 0, c=0;
		//try block
	    try {  
		c=a/b;
		if(c==0) { //If the value of C is 0, we have to call the catch block
			throw new ArithmeticException("/ by bigger numbber");
		}
	    }
	    //catch block
	    catch(ArithmeticException e)
	    {
	    	c=a/1;
	    	System.out.println("Found an exception called: "+e);
	    }
	    System.out.println(c);

	}

}
