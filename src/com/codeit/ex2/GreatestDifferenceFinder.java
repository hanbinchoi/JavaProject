package com.codeit.ex2;

public class GreatestDifferenceFinder {

    public int greatestDifference(int[] intArray){
        if (intArray.length<2) return 0;
        int max =intArray[0]-intArray[1];

        for(int i:intArray){
            for(int j:intArray){
                if(max<i-j) max =i-j;

            }
        }
        return max;
    }
}
