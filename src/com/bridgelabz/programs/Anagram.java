package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String");
		String string1 = scanner.nextLine();
		System.out.println("Enter the second string");
		String string2 = scanner.nextLine();

		string1 = Utility.removespace(string1);
		string2 = Utility.removespace(string2);

		if (string1.length() != string2.length()) {
			System.out.println("Strings are not anagram");
			return;
		}
		string1 = Utility.toLowerCase(string1);
		string2 = Utility.toLowerCase(string2);

		string1 = Utility.sort(string1);
		string2 = Utility.sort(string2);

		boolean result = Utility.compare(string1, string2);
		if (result == true) {
			System.out.println("the two strings are anagram");
		} else {
			System.out.println("the strings are not anagram");
		}

	}

}
