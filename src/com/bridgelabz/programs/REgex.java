package com.bridgelabz.programs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REgex {
	public static void main(String[] args) {
		String string = "Hello <<name>> We have your full name as <<full name>> "
				+ "in our system. your contact number is 91-xxxxxxxxxx."
				+ "Please,let us know in case of any clarification Thank " + "you BridgeLabz 01/01/2016.";

		Scanner scanner = new Scanner(System.in);
		Scanner sd = new Scanner(System.in);
		String string1 = "<<name>>";
		String string2 = "<<full name>>";
		String string3 = "xxxxxxxxxx";
		String string4 = "01/01/2016.";

		Pattern pattern;
		Matcher matcher;

		// to print the system date
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime localDateTime = LocalDateTime.now();

		System.out.println("enter the name");
		String name = scanner.next();

		System.out.println("enter full name");
		String fullname = sd.nextLine();

		System.out.println("enter the mobile number");
		String mobno = scanner.next();

		pattern = Pattern.compile(string1);
		matcher = pattern.matcher(string);
		string = matcher.replaceAll(name);

		pattern = Pattern.compile(string2);
		matcher = pattern.matcher(string);
		string = matcher.replaceAll(fullname);

		pattern = Pattern.compile(string3);
		matcher = pattern.matcher(string);
		string = matcher.replaceAll(mobno);

		pattern = Pattern.compile(string4);
		matcher = pattern.matcher(string);
		string = matcher.replaceAll(dateTimeFormat.format(localDateTime));

		System.out.println(string);
	}

}
