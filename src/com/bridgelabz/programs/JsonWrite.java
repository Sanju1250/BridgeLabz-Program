package com.bridgelabz.programs;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONArray;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonWrite {
	public static void main(String[] args) {
		JSONObject main = new JSONObject();
		JSONObject object = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		object.put("aaaa", 123);
		object.put("bbbb", "sanju");
		object.put("CCCC", "raju");
		jsonArray.add(object);
		main.put("dsfgbb", jsonArray);
		try {
			FileWriter f = new FileWriter("/home/bridgeit/workspace/BridgeLab/src/BridgeLab/do.json");
			f.write(main.toJSONString());
			f.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(main);
	}

}
