package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
	
		int a = 10, b = 0, c;
	    try {   
		c=a/b;
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Found an exception called: "+e);
	    }
	}

}
