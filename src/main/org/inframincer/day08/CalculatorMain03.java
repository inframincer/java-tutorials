package org.inframincer.day08;

class Calculator03 {
    int left, right;

    public void setOperands(int left, int right) {
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

class MultiplicationAbleCalculator03 extends Calculator03 {
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

class DivisionAbleCalculator03 extends MultiplicationAbleCalculator03 {
    public void division() {
        System.out.println(this.left / this.right);
    }
}

public class CalculatorMain03 {

    public static void main(String[] args) {
        MultiplicationAbleCalculator03 c1 = new MultiplicationAbleCalculator03();
        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();

        MultiplicationAbleCalculator03 c2 = new MultiplicationAbleCalculator03();
        c2.setOperands(20, 40);
        c2.sum();
        c2.avg();
        c2.multiplication();

        DivisionAbleCalculator03 c3 = new DivisionAbleCalculator03();
        c3.setOperands(30, 60);
        c3.sum();
        c3.avg();
        c3.multiplication();
        c3.division();
    }
}
