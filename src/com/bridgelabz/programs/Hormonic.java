package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Hormonic {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Hormonic Number");
		int Number = scanner.nextInt();
		System.out.println("the Hormonic value is " + Utility.hormonic(Number));

	}
}
