package com.company;

import java.util.Arrays;

public class Percentile extends QuantitativeMethods{
    int n;

    public Percentile(int[] data, int n){
        this.data = data;
        this.n=n;
    }

    int countValueBelow(){
        int count=0;
        for (int num : data) {
            if (num < n) {
                count++;
            }else {
                break;
            }
        }

        return count;
    }
    @Override
    double compute() {
        Arrays.sort(data);
        int below = countValueBelow();
        double x = (double) below/(double)data.length;
        double result = x*100;

        System.out.println("                    "+below);
        System.out.println("Percentile of "+n+" ="+"______");
        System.out.println("                    "+data.length);


        System.out.println("               ="+x+"*100");
        System.out.println();
        System.out.println("Percentile of "+n+" = "+result+"%");
        return result;
    }
}
