package io.github.lukeeff;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDivisible {

	Integer num;
	private ArrayList<Integer> allDivisibles;

	public FindDivisible() {
		allDivisibles = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getDivisibles() {
		return allDivisibles;
	}

	public void setNum() {
		allDivisibles.clear();
		Scanner userNum = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		confirmInput(userNum);
	}

	private void setDivisibles() {
		for (int i = 1; i < ((num / 2) + 1); i++) {
			if (checkDivisible(i)) {
				allDivisibles.add(i);
			}
		}
		allDivisibles.add(num);
	}

	private void confirmInput(Scanner userNum) {
		try {
			this.num = userNum.nextInt();
			setDivisibles();
		} catch (Exception e) {
			System.out.println("You can only use integers!");
		}
	}

	private boolean checkDivisible(int num) {
		if (this.num % num == 0) {
			return true;
		} else {
			return false;
		}
	}

}
