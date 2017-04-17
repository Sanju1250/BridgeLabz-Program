package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinaryTree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of nodes");
		int number = scanner.nextInt();
		double result = Utility.findNode(number);
		System.out.println("the number of nodes is " + Math.round(result));
	}

}
