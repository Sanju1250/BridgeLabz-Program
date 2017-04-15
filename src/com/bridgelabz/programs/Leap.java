package com.bridgelabz.programs;

import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class Leap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = scanner.nextInt();
		boolean result = Utility.leap(year);
		if (result) {
			System.out.println("The Given Year is Leap");
		} else {
			System.out.println("the Given year is not Leap");
		}
	}

}
