package org.inframincer.day07;

class Calculator02 {
    static final double PI = 3.14;
    // class member variable
    static int base = 0;
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(base + this.left + this.right);
    }

    public void avg() {
        System.out.println((base + this.left + this.right) / 2);
    }
}

public class CalculatorMain02 {

    public static void main(String[] args) {
        Calculator02 c1 = new Calculator02();
        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();
        System.out.println(c1.PI);
        System.out.println(Calculator02.PI);

        Calculator02 c2 = new Calculator02();
        c2.setOperands(20, 40);
        c2.sum();
        c2.avg();
        System.out.println(c2.PI);
        System.out.println(Calculator02.PI);

        Calculator02.base = 10;
        c1.sum();
        c2.sum();
    }
}
