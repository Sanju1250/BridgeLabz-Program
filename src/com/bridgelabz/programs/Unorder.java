package com.bridgelabz.programs;

import java.io.*;
import java.util.*;

public class Unorder {
	private static Node head;

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		ArrayList arrayList = new ArrayList();
		Scanner scanner1 = new Scanner(System.in);
		try {
			Scanner scanner = new Scanner(new File("/home/bridgeit/Desktop/JavaP/IPL.txt"));
			String string = scanner.nextLine();
			System.out.println(string);

			String string1[] = string.split(" ");

			for (int i = 0; i < string1.length; i++) {
				linkedList.add(string1[i]);
			}

		} catch (Exception e) {
			System.out.println("File not Found");
		}
		System.out.println("Enter the word to search");

		String item = scanner1.next();

		boolean result = linkedList.compare(item);
		if (result == true) {
			linkedList.remove(item);
		} else {
			linkedList.add(item);
		}
		arrayList = linkedList.fileWriter();
		String stringArray[] = new String[arrayList.size()];
		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = (String) arrayList.get(i);
		}
		try {

			FileWriter fileWriter = new FileWriter("/home/bridgeit/Desktop/JavaP/IPL.txt");

			for (int j = 0; j < stringArray.length; j++) {
				fileWriter.write(stringArray[j]);
				fileWriter.write(' ');
			}
			fileWriter.flush();
			fileWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
