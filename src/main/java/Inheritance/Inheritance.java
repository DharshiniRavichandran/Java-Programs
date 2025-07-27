package Inheritance;
//multilevel Inheritance
class Calculator{
	
	public int sum(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
}

class AdvancedCalculator extends Calculator{
	
	public int multi(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
}

class ScientificCalculator extends AdvancedCalculator {
	
	public int power(int a, int b)
	{
		return (int) Math.pow(a, b);
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		
		ScientificCalculator obj = new ScientificCalculator();
		int r1 = obj.sum(10, 5);
		int r2 = obj.sub(10, 5);
		int r3 = obj.multi(10, 5);
		int r4 = obj.div(10, 5);
		int r5 = obj.power(4, 2);
		System.out.println(r1+" "+r2+" "+r3+" "+r3+" "+r4+" "+r5);
		
    
	}

}
