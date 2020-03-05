package io.github.lukeeff;

import java.util.ArrayList;

//TODO make it so you can change the num 
//TODO static method for getting divisibles of random number

public class FindDivisible {

	Integer num;
	private ArrayList<Integer> allDivisibles;

	/**
	 * FindDivisible constructor that will not require user input
	 * @param num number for divisibles
	 */
	public FindDivisible(int num) {
		allDivisibles = new ArrayList<Integer>();
		setNum(num);
	}

	/**
	 * 
	 * @param num number that we want the divisibles of
	 * @return ArrayList of Integers that are divisible of parameter num
	 */
	public ArrayList<Integer> getDivisibles(int num) {
		return setDivisibles(num);
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
	public void setNum(int num) {
		this.num = num;
		allDivisibles.clear();
		allDivisibles = setDivisibles(num);
	}

	/**
	 * Checks divisibles and sets the ArrayList with numbers that are divisible by
	 * any number specified
	 */
	private ArrayList<Integer> setDivisibles(int num) {
		ArrayList<Integer> divisibles = new ArrayList<Integer>();
		// for loop starts at 1 to prevent divideby0 exception and only goes to half of
		// number being checked plus one to prevent unneccessary checking
		for (int i = 1; i <= num / 2; i++) {
			if (checkDivisible(i, num)) {
				divisibles.add(i);
			}
		}
		divisibles.add(num);
		return divisibles;
	}

	/**
	 * Checks for all divisibility of a number by another number
	 * 
	 * @param num a number that may or may not be divisible of field variable num
	 * @return true if divisible
	 */
	private boolean checkDivisible(int i, int num) {
		if (num % i == 0) {
			return true;
		} else {
			return false;
		}
	}

}
