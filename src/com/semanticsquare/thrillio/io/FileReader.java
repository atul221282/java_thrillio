package com.semanticsquare.thrillio.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class FileReader {

	private static String bookInFile = "Book.txt";
	private static String bookOutFile = "BookOut.txt";

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {
			readFile();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void readFile() throws FileNotFoundException, IOException {
		ArrayList<String> s = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(bookInFile), "UTF-8"));
				BufferedWriter out = new BufferedWriter(
						new OutputStreamWriter(new FileOutputStream(bookOutFile), "UTF-8"))) {
			String line;
			while ((line = in.readLine()) != null) {
				sb.append(line).append("\n");
				s.add(line);
			}
			out.write(sb.toString());
		}
	}
}
