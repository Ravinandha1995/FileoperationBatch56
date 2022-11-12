package org.filoperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Fileoperataion {

	void evenorder() throws Exception {
		// traditional way of printing the data in even order
		File f = new File("./java/selenium/project/batch56.txt");

		FileReader fi = new FileReader(f);
		BufferedReader br = new BufferedReader(fi);
		int count = 1;
		String st;
		while ((st = br.readLine()) != null) {
			if (count % 2 == 0) {
				System.out.println(st);
			}
			count++;
		}

	}

	void traditionalway() throws Exception {
		File f = new File("./java/selenium/project/batch56.txt");
		// filereader
		// fileinsputstream
		List<String> readLines = FileUtils.readLines(f);
		for (int i = 0; i < readLines.size(); i++) {
			if ((i + 1) % 2 == 0) {
				System.out.println(readLines.get(i));
				;
			}
		}
	}

	void writeTxt() throws Exception {
		File f = new File("./java/selenium/project/batch56.txt");
		// filereader
		// fileinsputstream
		List<String> readLines = FileUtils.readLines(f);
		FileUtils.write(f, "\tthis is the new line added",true);
	}
	
	void writemorethenonelineinaTXT() throws Exception {
		File f = new File("./java/selenium/project/batch56.txt");
		// filereader
		// fileinsputstream
		List<String> readLines = FileUtils.readLines(f);
		readLines.add("The Apache Commons IO library contains utility classes, stream implementations");
		readLines.add("file filters, file comparators, endian transformation classes, and much more.");
		FileUtils.writeLines(f, readLines);
	
	}
	
	// how to point the current project location
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		File f = new File("./java/selenium/project/batch56.txt");
		// filereader
		// fileinsputstream
		List<String> readLines = FileUtils.readLines(f);
		readLines.add(2, "this is the newly inserted data");
		FileUtils.writeLines(f, readLines);
		String readFileToString = FileUtils.readFileToString(f);
		
	}

}
