package org.filoperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;

import pojoclass.Root;

public class GSOBNNReader {
	
	public void gson() throws FileNotFoundException {
		
		BufferedReader bf = new BufferedReader(new FileReader(new File("./java/new/project1/batch56.json")));
		Gson gs = new Gson();
		Root root = gs.fromJson(bf,Root.class);
		
		String name = root.getStartClass().get(0).getName();
		System.out.println(name);
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
	
		
		
	}

}
