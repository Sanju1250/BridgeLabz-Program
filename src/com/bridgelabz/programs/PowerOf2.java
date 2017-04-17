package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PowerOf2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		for (int i = 0; i <= num; i++) {
			int result = Utility.power(2, i);
			System.out.println(result);
		}
	}
}
