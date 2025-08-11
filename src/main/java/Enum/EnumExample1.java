package Enum;

//Enum using getter and setter methods

import java.util.Scanner;

enum Laptop {
	Dell, XPS, Thinpad, Mackbook;

	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

public class EnumExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price:");
		for (Laptop lap : Laptop.values()) {
			int price = sc.nextInt();
			lap.setPrice(price);
			System.out.println("Laptop Type:" + lap + " Price:" + lap.getPrice());
		}
	}

}
