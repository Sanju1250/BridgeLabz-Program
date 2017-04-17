package com.bridgelabz.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			File file = new File("/home/bridgeit/text/mumbai");
			FileReader fileReader = new FileReader(file);
			StringBuffer stringBuffer = new StringBuffer();
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);

			}
			fileReader.close();
			System.out.println("Contents of file:");
			String string = stringBuffer.toString();
			System.out.println(string);
			String stringArray[] = string.split(" ");
			Arrays.sort(stringArray);
			System.out.println("enter the word to search");
			String searchWord = scanner.next();
			boolean result = Utility.BinarySearchString(stringArray, searchWord);
			if (result == true)
				System.out.println("given word is found");
			else
				System.out.println("the given word is not found");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
