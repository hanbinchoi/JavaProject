package com.codeit.ex2;

public class AverageFinder {
    public double computeAverage(int[] intArray){
        double sum =0;
        for(int i:intArray){
            sum += i;
        }
        return (double)(sum/ intArray.length);
    }
}
