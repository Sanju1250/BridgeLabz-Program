package com.bridgelabz.programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string");
		String st = scanner.next();
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length / 2; i++) {
			if (ch[i] != ch[ch.length - 1 - i]) {
				System.out.println("false");
				return;
			}

		}
		System.out.println("true");
	}
}
