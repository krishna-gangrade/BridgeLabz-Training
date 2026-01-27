package com.day1.travellog;

// Custom exception
public class InvalidTripException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidTripException(String msg) {
		super(msg);
	}
}
