package com.bridgelabz.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Hash {
	public static void main(String[] args) throws FileNotFoundException {
		LinkedList<Integer> list1;
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(new File("/home/bridgeit/hash.txt"));
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (scanner1.hasNext()) {
			list.add(scanner1.nextInt());
		}
		System.out.println(list);

		HashMap<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		for (Integer integer : list) {
			System.out.println(integer);

			int slotNo = integer % 11;
			System.out.println("Slot: " + slotNo);

			list1 = map.get(slotNo);
			if (list1 == null) {
				// System.out.println("Value is null");
				list1 = new LinkedList<Integer>();
				map.put(slotNo, list1);
			}

			// System.out.println("Value is not null");
			list1.add(integer);
		}
		System.out.println(map);

		System.out.println("Enter Number you want to search ");
		int num = scanner.nextInt();
		int SlotNumber = num % 11;
		// map1.get(SlotNumber);

		list1 = map.get(SlotNumber);
		System.out.println(list);
		if (list.contains(num)) {
			System.out.println("Number is present \nshould be delete");
			System.out.println(list1.pop() + " is poped");
		} else {
			System.out.println(num + " is not present \nshould be push");
			list1.add(num);
		}
		System.out.println(map);
		scanner.close();
		scanner1.close();
	}

}
