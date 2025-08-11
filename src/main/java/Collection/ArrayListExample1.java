package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Sorting using ArrayList
//Usually the list is unsorted
//Collection works with the wrapper class

public class ArrayListExample1 {
    
	public static void main(String[] args) {
		
		//If we want to implement any condition while sorting we can use Comparator interface
		Comparator<Integer> com = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				if(i%10>j%10) {
					return 1;
				}
				else
				{
					return -1;
				}
				
			}
		}; //Anonymous implementation
	
        //Initialization
		List<Integer> nums = new ArrayList<Integer>();
		
		//Adding values to the list
		nums.add(79);
		nums.add(92);
		nums.add(21);
		nums.add(57);
		nums.add(35);
		
		System.out.println("Normal sorting without any condition");
		Collections.sort(nums);
		System.out.println(nums);
		
		System.out.println("Sorting with condition: Sorting based on the last digit");
		Collections.sort(nums,com);
		System.out.println(nums);
	}

}
