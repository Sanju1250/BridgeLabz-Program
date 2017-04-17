package com.bridgelabz.programs;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonRead {
	public static void main(String[] args) {
		JSONParser jsonParser = new JSONParser();
		try {
			Object object = jsonParser.parse(new FileReader("/home/bridgeit/workspace/BridgeLab/src/BridgeLab/j.json"));
			JSONObject jsonObject = (JSONObject) object;
			System.out.println(jsonObject);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
