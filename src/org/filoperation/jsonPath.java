package org.filoperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonPath {

	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		FileReader fr= new FileReader(new File("./java/new/project1/batch56.json"));
		JSONParser js = new JSONParser();
		Object parse = js.parse(fr);
		JSONArray jar= (JSONArray)parse;
		jar.get(0);
	}
	
	
}
