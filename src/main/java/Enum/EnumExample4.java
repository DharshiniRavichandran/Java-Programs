package Enum;

//How to use enum inside and outside of the class?

enum Shop1 {
	dress1(10), dress2(20); // object+constructor

	int size;

	Shop1(int size) {
		this.size = size;

	}

	public void dressSize() {
		System.out.println(size);
	}
}

class Shop2 {
	enum Shop1 {
		dress1(10), dress2(20); // object+constructor

		int size;

		Shop1(int size) {
			this.size = size;

		}

		public void dressSize() {
			System.out.println(size);
		}
	}

	int size;

	public Shop2(int size) {
		this.size = size;
	}

	public void dressSize() {
		System.out.println(size);
	}

}

public class EnumExample4 {

	public static void main(String[] args) {

		// Assigning values using constructor (Normal class vs enum)
		Shop2 dress1 = new Shop2(10); // object+constructor
		Shop2 dress2 = new Shop2(20);

		// Using enum outside the class
		Shop1 dressOutside = Shop1.dress1;
		dressOutside.dressSize();
		Shop1.dress2.dressSize();

		// Using enum inside the class
		Shop2.Shop1 dressInside = Shop2.Shop1.dress1;
		dressInside.dressSize();
		Shop2.Shop1.dress2.dressSize();
	}

}
