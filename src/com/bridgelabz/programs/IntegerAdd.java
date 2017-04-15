package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class IntegerAdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the integer Value");
		int value = scanner.nextInt();
		Utility.addinteger(value);

	}

}
