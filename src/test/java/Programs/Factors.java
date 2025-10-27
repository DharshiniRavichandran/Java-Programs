package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Factors using ArrayList
//Find factors up to sqrt(n), add both i and n/i when applicable
//i = 1 → other = 36
//i = 2 → other = 18
//i = 3 → other = 12
//i = 4 → other = 9
//i = 6 → other = 6 (equal)

public class Factors {

	public static List<Integer> getSortedFactors(int n) {
		List<Integer> factors = new ArrayList<>();
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				factors.add(i);
				int other = n / i;
				if (other != i) {
					factors.add(other);
				}
			}
		}
		Collections.sort(factors);
		return factors;
	}

	public static void main(String[] args) {
		int number = 36;
		List<Integer> sortedFactors = getSortedFactors(number);
		System.out.println(sortedFactors);
	}

}
