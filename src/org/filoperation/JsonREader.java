package org.filoperation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonREader {

	public static void main(String[] args) throws IOException, ParseException {

		File f = new File("./java/new/project2/batch56.json");
		String s = "{\r\n" + "	\"companyName\":\"CTS\",\r\n" + "	\"interview\":[\r\n" + "			{\r\n"
				+ "				\"name\":\"shahul Hameed\",\r\n" + "				\"Experience\":[\r\n"
				+ "					{\r\n" + "						\"companyname\":\"TCS\",\r\n"
				+ "						\"totalyearofexperience\":\"8\"\r\n" + "					}\r\n"
				+ "					\r\n" + "					]\r\n" + "				\r\n" + "			}\r\n"
				+ "	\r\n" + "	]\r\n" + "\r\n" + "}";
		FileReader fr = new FileReader(f);
		JSONParser js = new JSONParser();
		Object parse = js.parse(fr);
		JSONObject jobj = new JSONObject(parse.toString());
		String string = jobj.getString("companyName");
		System.out.println(string);
		JSONArray jsonArray = jobj.getJSONArray("interview");
		
		JSONObject jsonObject = jsonArray.getJSONObject(0);
		String string2 = jsonObject.getString("name");
		System.out.println(string2);
		JSONArray Experience = jsonObject.getJSONArray("Experience");
		String a = Experience.getJSONObject(0).getString("totalyearofexperience");
		System.out.println(a);
		
	}

}
