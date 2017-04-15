package com.bridgelabz.utility;

import java.util.*;

public class Utility {
	static Scanner scanner = new Scanner(System.in);

	/**
	 * This method replace the sub String with given String in main String
	 * 
	 * @param mainString
	 *
	 * @param subString
	 *
	 * @param givenString
	 */
	public static String replace(String mainString, String givenString, String subString) {
		char charArray1[] = givenString.toCharArray();
		char charArray2[] = subString.toCharArray();
		givenString = "";
		for (int i = 0; i < charArray1.length; i++) {
			int k = i;
			int j = 0;
			while (k < charArray1.length && j < charArray2.length && charArray1[k] == charArray2[j]) {
				k++;
				j++;
			}
			if (j == charArray2.length) {
				givenString = givenString + mainString;
				i = k - 1;
			} else
				givenString = givenString + charArray1[i];
		}
		return givenString;
	}

	/**
	 * This method is used to find leap year
	 * 
	 * @param year
	 *
	 * @return boolean true/false
	 */
	public static boolean leap(int year) {
		if (year % 400 == 0 || year % 100 == 0 || year % 4 == 0)
			return true;
		else
			return false;
	}

	/**
	 * this method generates the random number
	 * 
	 * it will be return double value
	 * 
	 * @return double
	 */
	public static double random() {
		double number = Math.random();
		return number;
	}

	/**
	 * this method is used to find power of the number
	 * 
	 * @param number
	 * 
	 * @param power
	 * 
	 * @return Integer
	 */
	public static int power(int number, int power) {
		int result = 1;
		while (power > 0) {
			result = result * number;
			power--;
		}
		return result;
	}

	/**
	 * this method is used to find the N hormonic number
	 * 
	 * @param number
	 * @return double
	 */
	public static double hormonic(int number) {
		double temp = 0.0;
		double result = 0.0;
		for (int i = 1; i <= number; i++) {
			double j = (double) i;
			temp = 1 / j;
			result = result + temp;
		}
		return result;
	}

	/**
	 * this method is used to find prime Number Factors
	 * 
	 * @param number
	 * @return Integer
	 */
	public static int primefactor(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				int temp = 2;
				while (temp <= i / 2) {
					if (i % temp == 0) {
						break;
					}
					temp++;
				}
				if (temp > i / 2) {
					System.out.println(i);
				}

			}
		}
		return 0;

	}

	/**
	 * this method is used to show the Number of wins,wining percentage &
	 * Loosing percentage in a glambler Game
	 * 
	 * @param Stake
	 * @param Goal
	 * @param Step
	 * @param PlayGame
	 */
	public static void glambler(int Stake, int Goal, int Step, int PlayGame) {
		int count = 0;
		double WinPercent = 0.0;
		double LossPercent = 0.0;
		for (int i = 0; i < PlayGame; i++) {
			double j = Math.random();
			if (j > 0.5) {
				Stake = Stake + Step;
				count++;
			} else {
				Stake = Stake - Step;
			}
			if (Stake == Goal) {
				break;
			}
		}
		WinPercent = (count * 100) / PlayGame;
		LossPercent = 100 - WinPercent;
		System.out.println("Number of Win is " + count);
		System.out.println("Percentage  of Win is " + WinPercent);
		System.out.println("Percentage of loss is " + LossPercent);

	}

	/**
	 * this method is used to read the two dimensional integer array
	 * 
	 * @param row
	 * @param column
	 * @param array
	 * @return it will be returns two dimensional integer array
	 */
	public static int[][] readIntegerArray() {
		System.out.println("enter the number of rows");
		int row = scanner.nextInt();
		System.out.println("enter the number of column");
		int column = scanner.nextInt();
		int array[][] = new int[row][column];
		System.out.println("enter integer  element in the array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		return array;
	}

	/**
	 * this method is used to read two dimensional double array
	 * 
	 * @param row
	 * @param column
	 * @param array
	 * @return it will be retuns two dimensional double array
	 */
	public static double[][] readDoubleArray() {
		System.out.println("enter the number of rows");
		int row = scanner.nextInt();
		System.out.println("enter the number of column");
		int column = scanner.nextInt();
		double array[][] = new double[row][column];
		System.out.println("enter double element in the array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = scanner.nextDouble();

			}
		}
		return array;
	}

	/**
	 * this method is used to display integer array
	 * 
	 * @param array
	 * @return void
	 */
	public static void displayIntegerArray(int array[][]) {
		System.out.println("entered integer elements in the Array are as follows");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.println(array[i][j]);
			}
		}
	}

	/**
	 * this method is used to display double array
	 * 
	 * @param array
	 * @return void
	 */
	public static void displayDoubleArray(double array[][]) {
		System.out.println("entered double elements in the Array are as follows");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.println(array[i][j]);
			}
		}

	}

	/**
	 * this methoid is used to add Distinct tripples in the array
	 * 
	 * @param value
	 * @return void
	 */
	public static void addinteger(int value) {
		int array[] = new int[value];
		int sum = 0;
		int count = 0;
		System.out.println("enter the elements in the Array");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("the Distinct tripples are");
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				for (int k = j + 1; k < array.length; k++) {
					sum = array[i] + array[j] + array[k];
					if (sum == 0) {
						count++;
						System.out.println(+array[i] + "," + array[j] + "," + array[k]);

					}
				}
			}
		}
		System.out.println("Number of Distinct tripple is " + count);

	}

	/**
	 * this method is used to remove space in a srting
	 * 
	 * @param string
	 * @return it will be returns the string
	 */
	public static String removespace(String string) {
		char charArray[] = string.toCharArray();
		string = "";
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != ' ')
				string = string + charArray[i];
		}
		return string;
	}

	/**
	 * this method is used to convert uppercase letters to lowercase letters
	 *
	 * @param string
	 * 
	 * @return it will be returns the string
	 */
	public static String toLowerCase(String string) {
		char charArray[] = string.toCharArray();
		string = "";
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 65 && charArray[i] <= 90)
				string = string + (char) (charArray[i] + 32);
			else
				string = string + charArray[i];
		}
		return string;
	}

	/**
	 * this method is used to sort the character in a string in alphabetical
	 * Order
	 * 
	 * @param string
	 * 
	 * @return it will be returns the sorted string
	 */
	public static String sort(String string) {
		char charArray[] = string.toCharArray();
		string = "";
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] > charArray[j]) {
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}
		for (int i = 0; i < charArray.length; i++) {
			string = string + charArray[i];
		}
		return string;
	}

	/**
	 * this method is used to compare one String with another string
	 * 
	 * @param string1
	 * @param string2
	 * 
	 * @return it will return true if two strings are equal otherwise it returns
	 *         false
	 */
	public static boolean compare(String string1, String string2) {
		char charArray1[] = string1.toCharArray();
		char charArray2[] = string2.toCharArray();
		for (int i = 0; i < charArray1.length; i++) {
			if (charArray1[i] != charArray2[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * this method is used to get Start time in milisecond
	 * 
	 * @param StartTime
	 * @return long in milisecond
	 * 
	 */
	public static long startTime() {
		long StartTime = 0;
		System.out.println("Press Number 1 to start the timer");
		int number = scanner.nextInt();
		if (number == 1) {
			StartTime = System.currentTimeMillis();
		} else {
			System.out.println("Press Number 1 to start the timer");
			number = scanner.nextInt();
			if (number == 1) {
				StartTime = System.currentTimeMillis();
			}
		}
		return StartTime;
	}

	/**
	 * this method is used to get stop time in milisecond
	 * 
	 * @param StopTime
	 * @return long in miliSecond
	 * 
	 */
	public static long stopTime() {
		long StopTime = 0;
		System.out.println("Press Number 2 to stop the timer");
		int number = scanner.nextInt();
		if (number == 2) {
			StopTime = System.currentTimeMillis();
		} else {
			System.out.println("Press Number 2 to stop the timer");
			number = scanner.nextInt();
			if (number == 2) {
				StopTime = System.currentTimeMillis();
			}
		}
		return StopTime;
	}

	/**
	 * this method is used to find the guessing number in mind
	 * 
	 * @param low
	 * @param high
	 * @return it will returns the guessed number
	 */
	public static int searchNumber(int low, int high) {
		if (high - low == 1)
			return low;
		int mid = (low + high) / 2;

		System.out.println("is your number is less than " + mid + " ?");
		boolean status = scanner.nextBoolean();
		if (status == true)
			return searchNumber(low, mid);
		else
			return searchNumber(mid, high);
	}

	/**
	 * this method is used to search the string using Binary search
	 * 
	 * @param stringArray
	 * @param searchWord
	 * @return string found then it will be returns true otherwise it returns
	 *         false
	 */
	public static boolean BinarySearchString(String stringArray[], String searchWord) {
		int low = 0;
		int high = stringArray.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (stringArray[mid].equalsIgnoreCase(searchWord) == true) {

				return true;
			} else if (stringArray[mid].compareTo(searchWord) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		return false;
	}

	/**
	 * this method is used to sort the string using insertion sort
	 * 
	 * @param stringArray
	 * @return String Array
	 */
	public static String[] insertionStringSort(String stringArray[]) {
		for (int i = 1; i < stringArray.length; i++) {
			String temp = stringArray[i];
			int j = i;
			while (j > 0 && temp.compareTo(stringArray[j - 1]) < 0) {
				stringArray[j] = stringArray[j - 1];
				j--;
			}
			stringArray[j] = temp;
		}
		return stringArray;
	}

	/**
	 * this method is used to sort the String using Bubble sort
	 * 
	 * @param stringArray
	 * @return String Array
	 */
	public static String[] bubbleStringSort(String stringArray[]) {
		for (int i = 0; i < stringArray.length - 1; i++) {
			for (int j = i + 1; j < stringArray.length; j++) {
				if (stringArray[i].compareTo(stringArray[j]) > 0) {
					String temp = stringArray[i];
					stringArray[i] = stringArray[j];
					stringArray[j] = temp;
				}
			}
		}
		return stringArray;
	}

	/**
	 * this method is used to sort the integer array using bubble sort
	 * 
	 * @param array
	 * @return retuns the sorted array
	 */
	public static int[] bubbleInteger(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;

	}

	/**
	 * this method is used to sort integer using insertion sort
	 * 
	 * @param array
	 * @return sorted array
	 */
	public static int[] insertion(int array[]) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i;
			while (j > 0 && temp < (array[j - 1])) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = temp;
		}
		return array;

	}

	/**
	 * it is used to search a number using binay
	 * 
	 * @param int
	 *            array
	 * @param int
	 *            sd
	 * @return boolean true/false
	 */
	public static boolean Binary(int ss[], int sd) {
		int low = 0;
		int high = ss.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (ss[mid] == sd) {

				return true;
			} else if (ss[mid] < sd) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		return false;
	}

	/**
	 * this method is used to chek balanced paranth's
	 * 
	 * @param string
	 * @return if balance it will return true otherwise it returns false
	 */
	public static boolean balanced(String string) {
		Stack stack = new Stack();
		char charArray[] = string.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '{' || charArray[i] == '(' || charArray[i] == '[') {
				stack.push(charArray[i]);
			} else {
				switch (charArray[i]) {
				case '}':
					if ((char) stack.pop() != '{')
						return false;
					break;
				case ']':
					if ((char) stack.pop() != '[')
						return false;
					break;
				case ')':
					if ((char) stack.pop() != '(')
						return false;
					break;
				}
			}

		}
		return true;
	}

	static int array[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
	static int count = 0;
	static int one, two, five, ten, twenty, fifty, hundread, fivehun, thousand = 0;

	/**
	 * this method is used to print the number of notes of given Amount
	 * 
	 * @param number
	 * @return int
	 */
	public static int note(int number) {
		for (int i = array.length - 1; i >= 0; i--) {
			if (number >= array[i]) {
				count++;
				int sum = number - array[i];
				switch (array[i]) {
				case 1000:
					thousand++;
					break;
				case 500:
					fivehun++;
					break;
				case 100:
					hundread++;
					break;
				case 50:
					fifty++;
					break;
				case 20:
					twenty++;
					break;
				case 10:
					ten++;
					break;
				case 5:
					five++;
					break;
				case 2:
					two++;
					break;
				case 1:
					one++;

				}
				return note(sum);
			}
		}
		System.out.println("minimum Number of notes neded is " + count);
		System.out.println("the Notes are as Follows");
		System.out.println("1000 *" + thousand + "=" + 1000 * thousand);
		System.out.println("500  *" + fivehun + "=" + 500 * fivehun);
		System.out.println("100  *" + hundread + "=" + 100 * hundread);
		System.out.println("50   *" + fifty + "=" + 50 * fifty);
		System.out.println("20   *" + twenty + "=" + 20 * twenty);
		System.out.println("10   *" + ten + "=" + 10 * ten);
		System.out.println("5    *" + five + "=" + 5 * five);
		System.out.println("2    *" + two + "=" + 2 * two);
		System.out.println("1    *" + one + "=" + 1 * one);
		return 0;
	}

	static double sum = 0;

	/**
	 * this method is used to find the number of nodes in a binary tree
	 * 
	 * @param number
	 * @return double
	 */
	public static double findNode(int number) {

		if (number == 0 || number == 1)
			return 1;
		else if (number == 2)
			return 2;
		else {

			for (int i = 0; i < number; i++) {
				sum = sum + findNode(i) * findNode(number - i - 1);
			}
		}

		return sum;

	}
}
