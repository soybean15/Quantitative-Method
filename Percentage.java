package com.company;


public class Percentage extends QuantitativeMethods{
    int percentage;
    String name;

    public Percentage(double[] data){
        double total = 0;
        for(double d : data){
            total+=d;
        }

        System.out.print("Total: ");
        for(double n:data)
            System.out.print(n+" ");
        System.out.println("Average="+String.format("%.2f",total));


    }
    public Percentage(String name, int[] data, int percentage){
        this.name = name;
        this.data = data;
        this.percentage =percentage;
    }

     int addArray(int[] arr){
        int total = 0;
        for(int num:arr){
            total+=num;
        }
        return total;
    }

    void printData(){
        System.out.print(name+"("+(int)percentage+"%):");
        for(int n:data)
            System.out.print((int)n+" ");
    }

    @Override
    public double compute() {
        double percent = percentage/100d;

        double total = addArray(data);
        printData();
        System.out.print("="+total);
        System.out.print("  Ave:"+(total/data.length)*percent);
        System.out.println();
        return (total/data.length)*percent;
    }
}
