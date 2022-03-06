package com.company;

import java.util.Arrays;

public class InterQuartileRange extends QuantitativeMethods{

    public InterQuartileRange(int[] data){
        this.data =data;

    }

    private double getMedian(int[] arr, double k){

        double q = k/4d;
        System.out.println("     k");
        System.out.println("Qk= ___(n+1)");
        System.out.println("     4");

        System.out.println("     "+(int)k);
        System.out.println("Q"+(int)k+"=_____("+arr.length+"+1)");
        System.out.println("     4");

        double median = q*(arr.length+1);

        System.out.println("Q"+(int)k+"="+median+"th");

        return median;

    }

    private double getQuartile(int[] arr, double m){
        double decimalValue = m - (int)m;
        double index = Math.floor(m)-1;


        int median = arr[(int) index+1]-arr[(int) index];
        System.out.println(arr[(int) index+1]+"-"+arr[(int) index]+"="+median);

        double x = median * decimalValue;
        System.out.println(median+"x"+decimalValue+"="+x);

        double result = x+arr[(int) index];
        System.out.println(x+"+"+arr[(int) index]+"+"+"="+result);

        return result;
    }


    @Override
    double compute(){
        System.out.println("Quartile 1");
        double m1 = getMedian(data,1);
        double q1 = getQuartile(data, m1);
        System.out.println("Q1: "+q1);

        System.out.println();
        System.out.println();
        System.out.println("Quartile 3");
        double m3 = getMedian(data,3);
        double q3 = getQuartile(data, m3);
        System.out.println("Q2: "+q3);



        System.out.println();
        System.out.println();
        System.out.println("IR:");
        double ir = q3 - q1;
        System.out.println("IR =Q3-Q1");
        System.out.println("IR ="+q3+"-"+q1);
        System.out.println("Interquartile Range = "+ir);

        return ir;

    }
}
