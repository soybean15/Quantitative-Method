package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static void computRange(){
        Range r = new Range(new int[]{23,18,15,30,25,21});
        r.compute();
    }


    static void computeAverage(){
        Percentage quiz = new Percentage("Quiz",new int[]{80,85,87,90,83}, 30);
        Percentage performance = new Percentage("Performance",new int[]{90,92,89,93,95}, 20);
        Percentage excercise = new Percentage("Excercise",new int[]{92,89,90,94,96}, 20);
        Percentage midterm = new Percentage("midterm",new int[]{78}, 30);
        double q = quiz.compute();
        double p = performance.compute();
        double e = excercise.compute();
        double m= midterm.compute();


        new Percentage(new double[]{q,p,e,m});

    }

    static void computePercentile(){
        Percentile p = new Percentile(new int[]{2,3,3,4,5,5,5,6,7,7,8,8,8,9,9,10,11,11,12,12},11);
        p.compute();
    }

    static void computeInterQuartile(){
        int[] data ={200,320,218,405,64,98,89,140};
        System.out.println("Data: "+ Arrays.toString(data));
        Arrays.sort(data);
        System.out.println("Data: "+ Arrays.toString(data));
        InterQuartileRange ir = new InterQuartileRange(data);
        ir.compute();
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println("Quantitative Method");
        System.out.println("[1] Average");
        System.out.println("[2] Percentile");
        System.out.println("[3] Inter-Quartile Range");
        System.out.println("[4] Range");
        System.out.println();
        System.out.print("Select Option:");
        int option = sc.nextInt();

        switch (option){
            case 1: {
                computeAverage();
                break;
            }
            case 2: {
                computePercentile();
                break;
            }
            case 3: {
                computeInterQuartile();
                break;
            }
            case 4: {
                computRange();
                break;
            }
            default:
                System.out.println("Invalid");
        }
    }
}
