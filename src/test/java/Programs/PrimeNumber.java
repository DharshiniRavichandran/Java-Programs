package Programs;

import java.util.List;

//Checking if 11 is a prime number
//We’ll loop i = 1 to √11 → (approx 3)

//i = 1 → other = 11
//✅ 11 % 1 == 0 → 1 is a factor
//Add both 1 and 11 as factors

//i = 2 → 11 % 2 != 0 ❌
//Not a factor, skip

//i = 3 → 11 % 3 != 0 ❌
//Not a factor, skip

//Loop ends here (because 4*4 > 11)

//✅ Total factors = 2 → [1, 11]
//→ Number 11 has only two factors → Prime number

public class PrimeNumber {

	public static int findingPrimeNumber(int n) {
		int count = 0;
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				count++;
				int other = n / i;
				if (other != i) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int number = 24;
		int count = findingPrimeNumber(number);
		if (count == 2) {
			System.out.println("It's a prime number");
		} else {
			System.out.println("It's not a prime number");
		}
	}

}
