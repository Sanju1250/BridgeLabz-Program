package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class InsertionString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("enter number of words");
		int number = scanner.nextInt();
		String stringArray[] = new String[number];
		System.out.println("Enter the words");
		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = scanner1.nextLine();
		}
		String string[] = Utility.insertionStringSort(stringArray);
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}
	}

}
