package org.inframincer.day07;

class Calculator01 {
    static double PI = 3.14;
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

public class CalculatorMain01 {

    public static void main(String[] args) {
        Calculator01 c1 = new Calculator01();
        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();
        System.out.println(c1.PI);

        Calculator01.PI = 3.15;
        System.out.println(Calculator01.PI);

        Calculator01 c2 = new Calculator01();
        c2.setOperands(20, 40);
        c2.sum();
        c2.avg();
        System.out.println(c2.PI);
        System.out.println(Calculator01.PI);
    }
}
