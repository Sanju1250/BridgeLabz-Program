package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class ReplaceString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the String");
		String string = scanner.nextLine();
		String givenString = "Hello <<UserName>>, How are you?";
		String subString = "<<UserName>>";
		String result = Utility.replace(string, givenString, subString);
		System.out.println(result);
	}

}
