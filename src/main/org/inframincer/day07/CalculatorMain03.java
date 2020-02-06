package org.inframincer.day07;

public class CalculatorMain03 {

    public static void main(String[] args) {
        Calculator03.sum(10, 20);
        Calculator03.avg(10, 20);

        Calculator03.sum(20, 40);
        Calculator03.avg(20, 40);
    }
}

class Calculator03 {

    public static void sum(int left, int right){
        System.out.println(left+right);
    }

    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
}


