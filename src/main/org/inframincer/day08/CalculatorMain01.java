package org.inframincer.day08;

class Calculator01 {
    int left, right;

    public Calculator01(int left, int right) {
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

public class CalculatorMain01 {

    public static void main(String[] args) {
        Calculator01 c1 = new Calculator01(10, 20);
        c1.sum();
        c1.avg();

        Calculator01 c2 = new Calculator01(20, 40);
        c2.sum();
        c2.avg();
    }
}
