package Abstraction;

abstract class Absclass
{
	public abstract void abstractMethod1();
	public abstract void abstractMethod2();
}

public class AbstractAnonymousInnerClass {

	public static void main(String[] args) {
		
		Absclass obj = new Absclass() {
			@Override
			public void abstractMethod1()
			{
				System.out.println("Abstract anonymous inner class--1");
			}
			public void abstractMethod2()
			{
				System.out.println("Abstract anonymous inner class--2");
			}
			
		};
		obj.abstractMethod1();
		obj.abstractMethod2();
         
	}

}
