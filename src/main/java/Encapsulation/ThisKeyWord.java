package Encapsulation;

//  this keyword is to create differentiation between local and instance
//  variables. Basically we can access the instance variable using reference
//  variable of the class. this is keyword which represents current object which
//  is calling the method.

class ThisKeyWordImplementation {
	int id;
	String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id, ThisKeyWordImplementation obj) {
		ThisKeyWordImplementation obj1 = obj; // writing this much, java simply gives this keyword
		obj.id = id;
	}

	public void setName(String name) {
		this.name = name; // Here we declared this keyword which represents current object which is calling the method.
	}

}

public class ThisKeyWord {

	public static void main(String[] args) {

		ThisKeyWordImplementation obj = new ThisKeyWordImplementation();
		obj.setId(10, obj); // here we sent the object as parameter
		obj.setName("Dharshini"); // No need to that because of the this keyword
		System.out.println(obj.getId());
		System.out.println(obj.getName());

	}

}
