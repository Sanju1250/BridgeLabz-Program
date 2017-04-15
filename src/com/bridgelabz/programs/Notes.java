package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Notes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the amont in rupees");
		int amount = scanner.nextInt();
		Utility.note(amount);

	}
}
