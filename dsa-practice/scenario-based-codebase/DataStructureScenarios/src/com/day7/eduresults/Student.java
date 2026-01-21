package com.day7.eduresults;

class Student {

	private int rollNo;
	private String name;
	private int marks;
	private String district;

	public Student(int rollNo, String name, int marks, String district) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.district = district;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
	    return String.format(
	        "%-6d | %-15s | %-6d | %-10s",
	        rollNo, name, marks, district
	    );
	}

}