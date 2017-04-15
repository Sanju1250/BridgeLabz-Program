package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Balanced {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		boolean result = Utility.balanced(string);
		if (result)
			System.out.println("Arithametic expression is Balanced");
		else
			System.out.println("Arithematic expression is not Balanced");
	}
}
