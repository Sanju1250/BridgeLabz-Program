package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Glambler {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the amount of money you have");
		int Stake = scanner.nextInt();
		System.out.println("enter the amount of money to reach the target");
		int Goal = scanner.nextInt();
		System.out.println("enter the number of step");
		int Step = scanner.nextInt();
		System.out.println("enter the how many times you want to play the game");
		int PlayGame = scanner.nextInt();
		Utility.glambler(Stake, Goal, Step, PlayGame);
	}

}
