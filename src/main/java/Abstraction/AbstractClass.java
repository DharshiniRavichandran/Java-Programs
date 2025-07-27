package Abstraction;

abstract class PetShop{
	public abstract void petName();
	//Abstract class may or may not have normal method
	public void storeName()
	{
		System.out.println("Pet Shop");
	}
}
class Cat extends PetShop{
	public void petName()
	{
		System.out.println("Cat");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		
		Cat obj = new Cat();  //Can't create object for Abstract class
		//or
		PetShop obj1 = new Cat(); //Upcasting
		
        obj.storeName();
        obj.petName();
        
        obj1.storeName();
        obj1.petName();
	}

}
