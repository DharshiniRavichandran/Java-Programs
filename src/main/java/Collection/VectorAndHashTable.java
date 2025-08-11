package Collection;

import java.util.Hashtable;
import java.util.Vector;

public class VectorAndHashTable {

	public static void main(String[] args) {

		// Before the Collection Framework (before JDK 1.2), Java used Arrays, Vectors and Hashtables

		// 1. Array
		int[] array = { 1, 3, 5, 7, 9 };
		
		// 2. Vector
		Vector<Integer> vector = new Vector();
		vector.addElement(1);
		vector.addElement(3);
		
		// 3. Hashtables
		Hashtable<Integer, String> hashtable = new Hashtable();
		hashtable.put(1, "Dharhini");
		hashtable.put(2, "Ravichandran");
		hashtable.put(3, "Latha");

		// Accessing the first element of the array, vector and hashtable
		System.out.println(array[0]);
		System.out.println(vector.elementAt(1));
		System.out.println(hashtable.get(3));

	}

}
