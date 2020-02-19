package org.inframincer.day08;

class Calculator04 {
    int left, right;

    public Calculator04(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class MultiplicationAbleCalculator04 extends Calculator04 {
    public MultiplicationAbleCalculator04(int left, int right) {
        super(left, right);
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

public class CalculatorMain04 {

    public static void main(String[] args) {
        MultiplicationAbleCalculator04 c = new MultiplicationAbleCalculator04(10, 20);
        c.sum();
        c.avg();
        c.multiplication();
    }
}
