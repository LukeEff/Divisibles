package io.github.lukeeff;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDivisible {

	Integer num;
	private ArrayList<Integer> allDivisibles;

	public FindDivisible() {
		allDivisibles = new ArrayList<Integer>();
	}

	/**
	 * Gets and returns the allDivisibles ArrayList
	 * 
	 * @return the numbers that are divisible of the specified number.
	 */
	public ArrayList<Integer> getDivisibles() {
		return allDivisibles;
	}

	/**
	 * Clears the ArrayList and asks the user for a number and then will call
	 * confirmInput
	 */
	public void setNum() {
		allDivisibles.clear();
		Scanner userNum = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		confirmInput(userNum);
	}

	/**
	 * Checks divisibles and sets the ArrayList with numbers that are divisible by
	 * any number specified
	 */
	private void setDivisibles() {
		// for loop starts at 1 to prevent divideby0 exception and only goes to half of
		// number being checked plus one to prevent unneccessary checking
		for (int i = 1; i < ((num / 2) + 1); i++) {
			if (checkDivisible(i)) {
				allDivisibles.add(i);
			}
		}
		allDivisibles.add(num);
	}

	/**
	 * Confirms an input is valid to be checked for divisibility by
	 * 
	 * @param userNum the number being checked for divisibility chosen by the user
	 */
	private void confirmInput(Scanner userNum) {
		try {
			this.num = userNum.nextInt();
			setDivisibles();
		} catch (Exception e) {
			System.out.println("You can only use integers!");
		}
	}

	/**
	 * Checks for all divisibility of a number by another number
	 * 
	 * @param num a number that may or may not be divisible of field variable num
	 * @return true if divisible
	 */
	private boolean checkDivisible(int num) {
		if (this.num % num == 0) {
			return true;
		} else {
			return false;
		}
	}

}
