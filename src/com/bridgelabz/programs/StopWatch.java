package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class StopWatch {
	public static void main(String[] args) {
		long elapsedTime = 0;
		long startTime = Utility.startTime();
		long stopTime = Utility.stopTime();
		System.out.println("the elapsed time is " + (stopTime - startTime) + " in mili second");
		System.out.println("the elapsed time is " + (stopTime - startTime) / 1000 + " in second");

	}

}
