package com.day6.medistore;

public interface ISellable {
	double sell(int units);
	boolean checkExpiry();
}