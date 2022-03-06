package com.company;

import java.util.Arrays;

public class Range extends QuantitativeMethods{

    public Range(int[] data){
        this.data = data;
    }

    int getMax(int[] arr){
        int max = arr[0];
        for(int n:arr){
            if(max<n)
                max = n;
        }
        return max;
    }
    int getMin(int[] arr){
        int min = arr[0];
        for(int n:arr){
            if(min>n)
                min = n;
        }
        return min;
    }
    @Override
    double compute() {
        int highest = getMax(data);
        int lowest = getMin(data);

        int range = highest-lowest;

        System.out.println("Data: "+ Arrays.toString(data));
        System.out.println("Range = Highest - Lowest");

        System.out.println("      = "+highest+" - "+lowest+"");
        System.out.println("Range = "+range);

        return 0;
    }
}
