package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Bubble {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter how many integer do you want");
		int number = scanner.nextInt();
		int array[] = new int[number];
		System.out.println("Enter the elsement");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("sorted elsements are");
		int resultArray[] = Utility.bubbleInteger(array);
		for (int i = 0; i < resultArray.length; i++) {
			System.out.println(resultArray[i]);
		}
	}

}
