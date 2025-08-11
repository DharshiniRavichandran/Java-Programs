package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {

		Comparator<String> com = new Comparator<String>() {

			public int compare(String i, String j) {

				if (i.length() > j.length()) {
					return 1;
				} else {
					return -1;
				}

			}
		};

		List<String> name = new ArrayList<>();
		name.add("John");
		name.add("Georgyy");
		name.add("Bob");
		name.add("france");

		System.out.println("Before sorting: " + name);

		Collections.sort(name);

		System.out.println("After sorting: " + name);

		Collections.sort(name, com);

		System.out.println("Sorting based on the length of the string: " + name);

	}

}
