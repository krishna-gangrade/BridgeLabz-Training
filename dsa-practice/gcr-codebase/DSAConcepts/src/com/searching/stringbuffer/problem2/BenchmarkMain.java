package com.searching.stringbuffer.problem2;

public class BenchmarkMain {

    public static void main(String[] args) {

        long bufferTime = StringConcateBenchmark.testStringBuffer();
        long builderTime = StringConcateBenchmark.testStringBuilder();

        System.out.println("StringBuffer Time (ns): " + bufferTime);
        System.out.println("StringBuilder Time (ns): " + builderTime);
    }
}