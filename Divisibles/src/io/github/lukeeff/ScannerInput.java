package io.github.lukeeff;

import java.util.Scanner;

public class ScannerInput {

	static Scanner userString;
	static Scanner userInt;
	static Scanner userDouble;
	
	public ScannerInput() {
		
	}
	
	/**
	 * Get a String object from the user
	 * @return String object that was inputted by user
	 */
	public static String getUserString() {
		userString = new Scanner(System.in);
		return userString.nextLine();
	}
	
	/**
	 * Get an Integer object from the user
	 * @return Integer object that was inputted by user
	 */
	public static Integer getUserInteger() {
		userInt = new Scanner(System.in);
		return userInt.nextInt();
	}
	
	/**
	 * Get a Double object from the user
	 * @return Double object that was inputted by user
	 */
	public static Double getUserDouble() {
		userDouble = new Scanner(System.in);
		return userDouble.nextDouble();
	}
	
}
