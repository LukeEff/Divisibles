package io.github.lukeeff;

import java.util.Scanner;

public class Divisible {

	static FindDivisible divisible;
	static Scanner num;
	public static void main(String[] args) {
		divisible = new FindDivisible();
		requestDivisible();

	}

	private static void requestDivisible() {
		
		divisible.setNum();
		System.out.println(divisible.getDivisibles());
		requestDivisible();
	}
	
}
