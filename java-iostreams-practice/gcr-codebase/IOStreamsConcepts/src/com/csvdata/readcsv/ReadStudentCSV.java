package com.csvdata.readcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentCSV {
    public static void main(String[] args) {
	// sample file path
	String filePath = "samplefiles/readcsv/students.csv";

	try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	    String line;
	    boolean isHeader = true;

	    while ((line = reader.readLine()) != null) {

	        // skip empty lines
	        if (line.trim().isEmpty()) {
	            continue;
	        }

	        // skip header
	        if (isHeader) {
	            isHeader = false;
	            continue;
	        }

	        String[] arr = line.split(",");

	        // safety check
	        if (arr.length < 4) {
	            System.out.println("Invalid row: " + line);
	            continue;
	        }

	        System.out.println(
	            "ID: " + arr[0] +
	            ", Name: " + arr[1] +
	            ", Age: " + arr[2] +
	            ", Marks: " + arr[3]
	        );
	    }

	} catch (IOException e) {
	    System.out.println("Error reading CSV file");
	}
    }
}
