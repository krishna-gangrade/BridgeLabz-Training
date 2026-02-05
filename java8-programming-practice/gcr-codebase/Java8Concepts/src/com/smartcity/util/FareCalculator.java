package com.smartcity.util;

@FunctionalInterface
public interface FareCalculator {
    double calculateFare(double distance, double baseFare, boolean isPeak);
}
