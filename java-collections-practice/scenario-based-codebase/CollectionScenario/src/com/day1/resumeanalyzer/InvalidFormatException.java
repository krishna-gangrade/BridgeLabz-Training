package com.day1.resumeanalyzer;

// Custom exception
public class InvalidFormatException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidFormatException(String msg) {
		super(msg);
	}
}
