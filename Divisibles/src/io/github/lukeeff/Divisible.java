package io.github.lukeeff;

import java.util.Scanner;

public class Divisible {

	static FindDivisible divisible;
	static Scanner num;

	public static void main(String[] args) {
		someNumbers();
		printDivisibles(getUserNum());
	}
	
	private static void someNumbers() {
		divisible = new FindDivisible(50);
		System.out.println(divisible.getDivisibles());
		System.out.println(divisible.getDivisibles(500));
	}
	
	private static int getUserNum() {
		num = new Scanner(System.in);
		System.out.println("Choose a number");
		return num.nextInt();
	}
	
	private static void printDivisibles(int num) {
		System.out.println(divisible.getDivisibles(num));
	}
	
	
}
