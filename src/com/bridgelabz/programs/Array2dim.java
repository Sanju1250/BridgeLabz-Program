package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Array2dim {
	public static void main(String[] args) {

		int integerArray[][] = Utility.readIntegerArray();
		double doubleArray[][] = Utility.readDoubleArray();
		Utility.displayIntegerArray(integerArray);
		Utility.displayDoubleArray(doubleArray);
	}
}
