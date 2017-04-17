package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of times to Flip a Coin");
		int Number = scanner.nextInt();
		int Head = 0;
		double HeadPercentage = 0.0;
		double TailPercentage = 0.0;
		for (int i = 0; i < Number; i++) {

			if (Utility.random() < 0.5) {
				Head++;
			}
		}
		HeadPercentage = (Head * 100) / Number;
		TailPercentage = 100 - HeadPercentage;
		System.out.println("The percent of Head is " + HeadPercentage);
		System.out.println("The percent of Tail is " + TailPercentage);
	}

}
