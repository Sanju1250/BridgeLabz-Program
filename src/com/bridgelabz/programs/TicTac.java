package com.bridgelabz.programs;

import java.util.*;
import java.util.Scanner;

public class TicTac {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List list = new ArrayList();
		char charArray[][] = new char[3][3];
		int intArray[][] = new int[3][3];
		System.out.println("enter the first player name");
		String firstName = scanner.next();
		System.out.println("enter the second player name");
		String secondName = scanner.next();
		for (int a = 0; a < charArray.length; a++) {
			for (int b = 0; b < charArray.length; b++) {
				charArray[a][b] = '_';
			}
		}
		int i;
		int j;

		for (int k = 0; k < 9; k++) {

			System.out.println("enter the " + firstName + " input");
			charArray[i = scanner.nextInt()][j = scanner.nextInt()] = 'x';
			if (intArray[i][j] == 1) {
				System.out.println("enter the correct value");
				charArray[i = scanner.nextInt()][j = scanner.nextInt()] = 'x';
			}
			intArray[i][j] = 1;

			for (int a = 0; a < charArray.length; a++) {
				for (int b = 0; b < charArray.length; b++) {
					System.out.print(charArray[a][b] + "\t");
				}
				System.out.println("");
			}

			if (charArray[0][0] == 'x' && charArray[0][1] == 'x' && charArray[0][2] == 'x'
					|| charArray[1][0] == 'x' && charArray[1][1] == 'x' && charArray[1][2] == 'x'
					|| charArray[2][0] == 'x' && charArray[2][1] == 'x' && charArray[2][2] == 'x'
					|| charArray[0][0] == 'x' && charArray[1][0] == 'x' && charArray[2][0] == 'x'
					|| charArray[0][1] == 'x' && charArray[1][1] == 'x' && charArray[2][1] == 'x'
					|| charArray[0][2] == 'x' && charArray[1][2] == 'x' && charArray[2][2] == 'x'
					|| charArray[0][0] == 'x' && charArray[1][1] == 'x' && charArray[2][2] == 'x'
					|| charArray[0][2] == 'x' && charArray[1][1] == 'x' && charArray[2][0] == 'x')

			{
				System.out.println(firstName + " is won the match");
				return;

			}
			System.out.println("-----------------------------");

			System.out.println("enter the " + secondName + " input");
			charArray[i = scanner.nextInt()][j = scanner.nextInt()] = 'o';
			if (intArray[i][j] == 1) {
				System.out.println("enter the correct value");
				charArray[i = scanner.nextInt()][j = scanner.nextInt()] = 'o';
			}
			intArray[i][j] = 1;

			for (int a = 0; a < charArray.length; a++) {
				for (int b = 0; b < charArray.length; b++) {
					System.out.print((char) charArray[a][b] + "\t");
				}
				System.out.println();
			}

			if (charArray[0][0] == 'o' && charArray[0][1] == 2 && charArray[0][2] == 'o'
					|| charArray[1][0] == 'o' && charArray[1][1] == 'o' && charArray[1][2] == 'o'
					|| charArray[2][0] == 'o' && charArray[2][1] == 'o' && charArray[2][2] == 'o'
					|| charArray[0][0] == 'o' && charArray[1][0] == 'o' && charArray[2][0] == 'o'
					|| charArray[0][1] == 'o' && charArray[1][1] == 'o' && charArray[2][1] == 'o'
					|| charArray[0][2] == 'o' && charArray[1][2] == 'o' && charArray[2][2] == 'o'
					|| charArray[0][0] == 'o' && charArray[1][1] == 'o' && charArray[2][2] == 'o'
					|| charArray[0][2] == 'o' && charArray[1][1] == 'o' && charArray[2][0] == 'o')

			{
				System.out.println(secondName + "  is won the match");
				return;
			}

			System.out.println("-----------------------------");

			k++;
		}
		System.out.println("Draw Match");

	}

}
