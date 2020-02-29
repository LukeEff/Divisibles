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
		Scanner userNum = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		confirmInput(userNum);
	}
	
	private void setDivisibles() {
		allDivisibles.clear();
		for(int i = 1; i < ((num/2) + 1); i++) {
			if(checkDivisible(i)) {
				allDivisibles.add(i);
			}
		}
	}
	
	private void confirmInput(Scanner userNum) {
		try { 
			Integer num = userNum.nextInt();
			this.num = num;
			setDivisibles();
		} catch (Exception e) {
			System.out.println("You can only use integers!");
			setNum();
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
