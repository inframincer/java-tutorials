package org.inframincer.day08;

class Calculator02 {
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

class SubtractionAbleCalculator02 extends Calculator02 {
    public void subtraction() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorMain02 {

    public static void main(String[] args) {
        SubtractionAbleCalculator02 c1 = new SubtractionAbleCalculator02();
        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();
        c1.subtraction();

        SubtractionAbleCalculator02 c2 = new SubtractionAbleCalculator02();
        c2.setOperands(20, 40);
        c2.sum();
        c2.avg();
        c2.subtraction();
    }
}
