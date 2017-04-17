package com.bridgelabz.programs;

import java.util.*;

public class Stock {
	public static void main(String[] args) {
		Scanner stringScanner = new Scanner(System.in);
		Scanner integerScanner = new Scanner(System.in);
		Scanner doubleScanner = new Scanner(System.in);
		ArrayList<StockReport> arrayList = new ArrayList<StockReport>();
		System.out.println("enter the number of Stocks");
		int Nstock = integerScanner.nextInt();
		int i = 0;
		double stockValue = 0.0;
		while (i < Nstock) {
			System.out.println("enter the Share Name");
			String StockName = stringScanner.nextLine();

			System.out.println("enter the Share Number");
			int ShareNumber = integerScanner.nextInt();

			System.out.println("enter the Share price");
			double SharePrice = doubleScanner.nextDouble();
			stockValue = ShareNumber * SharePrice;
			arrayList.add(new StockReport(StockName, ShareNumber, SharePrice, stockValue));
			i++;

		}
		double sum=0;
		System.out.println("The stock Report is");
		System.out.println();
		System.out.println("shareName Number price stockValue");
		for(int j=0;j<arrayList.size();j++)
		{
			System.out.print(arrayList.get(j).shareName+"\t");
			System.out.print(arrayList.get(j).shareNumber+"\t");
			System.out.print(arrayList.get(j).sharePrice+"\t");
			System.out.print(arrayList.get(j).stockValue+"\t");
			System.out.println();
		    sum=sum+arrayList.get(j).stockValue;
			
		}
		System.out.println("the total stock vale is "+sum);
		

	}

}
