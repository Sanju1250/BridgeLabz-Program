package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Factors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number to find prime Factors");
		int Number = scanner.nextInt();
		Utility.primefactor(Number);

	}
}
