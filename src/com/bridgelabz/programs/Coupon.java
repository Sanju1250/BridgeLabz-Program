package com.bridgelabz.programs;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Coupon {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Distinct coupon number");
		int CouponNumber = scanner.nextInt();
		int i = 0;
		int count = 0;
		Set set = new LinkedHashSet();

		Random r = new Random();
		while (i < CouponNumber) {
			int RandomNumber = r.nextInt(CouponNumber);
			count++;
			set.add(RandomNumber);
			i = set.size();
		}
		System.out.println(set);
		System.out.println("the number of times coupon generated " + count);
	}
}
