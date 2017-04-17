package com.bridgelabz.programs;

import java.io.*;
import java.util.Scanner;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Clinic {
	public static void main(String[] args) {
		JSONParser jsonparser = new JSONParser();
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		try {
			Object object = jsonparser.parse(new FileReader("/home/bridgeit/eclipse/doctor.json"));
			JSONObject jsonObject = (JSONObject) object;

			System.out.println("Welcome to Ramaya Hospital Bangalore");
			System.out.println("");

			System.out.println("List of Doctors associated with Clinic ");
			System.out.println();
			JSONArray jsonArray = (JSONArray) jsonObject.get("Doctor");
			Iterator iterator = jsonArray.iterator();
			while (iterator.hasNext()) {

				System.out.println(iterator.next());
			}
			System.out.println();

			System.out.println("List of Patient associated with Clinic ");
			System.out.println();
			jsonArray = (JSONArray) jsonObject.get("Patient");
			Iterator iterator1 = jsonArray.iterator();
			while (iterator1.hasNext()) {

				System.out.println(iterator1.next());
			}
			System.out.println();
			System.out.println("enter the choice to search the doctor by");
			System.out.println("1 for name");
			System.out.println("2 for id");
			System.out.println("3 for availabilty");
			System.out.println("4 for specilist");
			System.out.println("enter the choice");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the Name of Doctor");
				String string = scanner.next();
				jsonArray = (JSONArray) jsonObject.get("Doctor");
				for (int i = 0; i < jsonArray.size(); i++) {
					JSONObject jsonObject1 = (JSONObject) jsonArray.get(i);
					String name = (String) jsonObject1.get("name");
					if (name.equalsIgnoreCase(string))
						System.out.println(jsonObject1);

				}
				System.out.println();
				break;
			case 2:
				System.out.println("Search the Doctor by id");
				System.out.println("Enter the id of Doctor");
				long docId = scanner.nextLong();
				jsonArray = (JSONArray) jsonObject.get("Doctor");
				for (int i = 0; i < jsonArray.size(); i++) {
					JSONObject jsonObject2 = (JSONObject) jsonArray.get(i);
					long id = (long) jsonObject2.get("id");
					if (docId == id)
						System.out.println(jsonObject2);

				}
				break;
			case 3:
				System.out.println("Search the Doctor by availabilty");
				System.out.println("Enter the availabilty of Doctor");
				String available = scanner.next();
				jsonArray = (JSONArray) jsonObject.get("Doctor");
				for (int i = 0; i < jsonArray.size(); i++) {
					JSONObject jsonObject3 = (JSONObject) jsonArray.get(i);
					String avalable = (String) jsonObject3.get("availability");
					if (available.equalsIgnoreCase(avalable))
						System.out.println(jsonObject3);

				}
				break;
			case 4:
				System.out.println("Search the Doctor by specilist");
				System.out.println("Enter  specilist of Doctor");
				String specilist = scanner.next();
				jsonArray = (JSONArray) jsonObject.get("Doctor");
				for (int i = 0; i < jsonArray.size(); i++) {
					JSONObject jsonObject4 = (JSONObject) jsonArray.get(i);
					String ss = (String) jsonObject4.get("specilist");
					if (specilist.equalsIgnoreCase(ss))
						System.out.println(jsonObject4);

				}
				break;
			default:
				System.out.println("Invalid choice");
			}

			System.out.println("enter the choice to search the Patient by");
			System.out.println("1 for name");
			System.out.println("2 for id");
			System.out.println("3 for mobile number");
			System.out.println("4 for age");
			System.out.println("Enter the choice");
			int ch = scanner.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the name of patient");
				String pname = scanner.next();
				jsonArray = (JSONArray) jsonObject.get("Patient");
				for (int i = 0; i < jsonArray.size(); i++) {
					JSONObject jsonObject5 = (JSONObject) jsonArray.get(i);
					String patientName = (String) jsonObject5.get("name");
					if (pname.equalsIgnoreCase(patientName))
						System.out.println(jsonObject5);

				}
				break;
			case 2:
				System.out.println("Enter the id of patient");
				int pid = scanner.nextInt();
				jsonArray = (JSONArray) jsonObject.get("Patient");
				for (int i = 0; i < jsonArray.size(); i++) {
					JSONObject jsonObject6 = (JSONObject) jsonArray.get(i);
					long patientId = (long) jsonObject6.get("id");
					if (patientId == pid)
						System.out.println(jsonObject6);

				}
				break;
			case 3:
				System.out.println("Enter the mobile No of patient");
				long mobno = scanner.nextLong();
				jsonArray = (JSONArray) jsonObject.get("Patient");
				for (int i = 0; i < jsonArray.size(); i++) {
					JSONObject jsonObject7 = (JSONObject) jsonArray.get(i);
					long mobileNo = (long) jsonObject7.get("MobNO");
					if (mobileNo == mobno)
						System.out.println(jsonObject7);

				}
				break;
			case 4:
				System.out.println("Enter the age of patient");
				long age = scanner.nextLong();
				jsonArray = (JSONArray) jsonObject.get("Patient");
				for (int i = 0; i < jsonArray.size(); i++) {
					JSONObject jsonObject8 = (JSONObject) jsonArray.get(i);
					long patage = (long) jsonObject8.get("age");
					if (patage == age)
						System.out.println(jsonObject8);

				}
				break;
			default:
				System.out.println("invalid choice");

			}
			System.out.println("Enter the patients to take the appointment with doctor");
			JSONObject main = new JSONObject();
			JSONObject jsonobject9 = new JSONObject();
			System.out.println("enter the name of doctor");
			String docName = scanner.next();
			System.out.println("enter the docid");
			int docid = scanner.nextInt();
			System.out.println("enter the patient name");
			String patName = scanner.next();
			System.out.println("enter the patient id");
			int patid = scanner.nextInt();
			System.out.println("enter the appointment date");
			String appDate = scanner.next();
			// JSONArray ja1 = new JSONArray();
			// jsonobject1.put("DoctorName", docName);
			// jsonobject1.put("Doctorid", docid);
			// jsonobject1.put("PatientName", patid);
			// jsonobject1.put("patientNo", patid);
			// jsonobject1.put("date", appDate);
			// ja1.add(jsonobject1);
			// main.put("Appointment", ja1);
			jsonArray = (JSONArray) jsonObject.get("Appointment");

			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject jsonObject10 = (JSONObject) jsonArray.get(i);
				String doctorName = (String) jsonObject10.get("DoctorName");

				if (doctorName.equalsIgnoreCase(docName))

				{
					long patientNumber = (long) jsonObject10.get("patientNo");
					if (patientNumber >= 5) {

						System.out.println("Please come on Tommorow");
						return;
					}
					break;
				}
			}
			System.out.println("The Medical Report is");
			System.out.println("docName\tdocid\tpatName\tpatid\tappDate");
			System.out.print(docName + "\t");
			System.out.print(docid + "\t");
			System.out.print(patName + "\t");
			System.out.print(patid + "\t");
			System.out.print(appDate + "\t");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
