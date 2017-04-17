package com.bridgelabz.programs;

import java.util.Scanner;

public class Frog {
	static int funtion(int start, int height, int steps) {
		int count = 0;
		int result = 0;
		int temp = 0;
		while (temp < height) {
			result = start + steps;
			start = result - 1;
			temp = start;

			count++;

		}
		return count;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Hieght of wall");
		int height = scanner.nextInt();
		System.out.println("Enter the steps to jump");
		int steps = scanner.nextInt();
		steps = funtion(0, height, steps);
		System.out.println("the number of step required is");
		System.out.println(steps);
		scanner.close();
	}

}
