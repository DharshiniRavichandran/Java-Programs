package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
//Storing values and Traverse using Iterator Interface
	public static void main(String[] args) {
		// Create an ArrayList of Strings
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		// Get an iterator for the ArrayList
		Iterator<String> it = cars.iterator();
		// Iterate through the list using the iterator
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		for (int i = 0; i < cars.size(); i++) {
		      System.out.println(cars.get(i));
		    }
	}
}


//Common to List and Set
//add()	Adds an element to the end of the list
//get()	Returns the element at the specified position
//set()	Replaces the element at the specified position
//remove()	Removes the element at the specified position
//size()	Returns the number of elements in the list
