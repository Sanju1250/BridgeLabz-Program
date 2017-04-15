package com.bridgelabz.programs;

import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class FindNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int number = scanner.nextInt();
		System.out.println("think one number between 0 to N-1");
		int high = number;
		number = Utility.searchNumber(0, high);
		System.out.println("your number is " + number);

	}

}
