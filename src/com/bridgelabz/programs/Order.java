package com.bridgelabz.programs;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class Order {
	static Scanner scanner = null;

	public static void main(String[] args) {
		List list = new LinkedList();
		int s = 0;
		try {
			scanner = new Scanner(new File("/home/bridgeit/Desktop/JavaP/sss.txt"));
			String string = scanner.nextLine();
			String stringArray[] = string.split(" ");
			int array[] = new int[stringArray.length];
			for (int i = 0; i < array.length; i++) {
				int num = Integer.parseInt(stringArray[i]);
				array[i] = num;
			}
			Arrays.sort(array);
			System.out.println("the elements in the file is");
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
				list.add(array[i]);
			}
			scanner = new Scanner(System.in);
			System.out.println("enter the number");
			int number = scanner.nextInt();
			int flag = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == number) {
					flag = 1;
					System.out.println("the element is found");
					break;
				}
			}
			if (flag == 0) {
				list.add(number);
			} else {
				int a[] = new int[array.length - 1];

				for (int k = 0; k < array.length - 1; k++) {
					if (number == array[k]) {
						k++;
					}
					a[s] = array[k];
					s++;
				}
				for (int i = 0; i < a.length; i++) {
					System.out.println(a[i]);
				}
				return;

			}
			int b[] = new int[array.length + 1];
			for (int m = 0; m < b.length; m++) {
				b[m] = (int) list.get(m);
			}
			Arrays.sort(b);

			try {
				FileWriter fileWriter = new FileWriter("/home/bridgeit/Desktop/JavaP/sss.txt");
				for (int i = 0; i < b.length; i++) {
					fileWriter.write(b[i]);
					fileWriter.write(' ');
					System.out.println(b[i]);
				}
				fileWriter.flush();
				fileWriter.close();
			
			} catch (Exception e) {

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
