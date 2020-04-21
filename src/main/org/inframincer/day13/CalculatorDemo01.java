package org.inframincer.day13;

class Calculator01 {
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void divide() {
        System.out.print("계산결과는 ");
        System.out.print(this.left / this.right);
        System.out.print(" 입니다.");
    }
}

public class CalculatorDemo01 {
    public static void main(String[] args) {
        Calculator01 c1 = new Calculator01();
        c1.setOperands(10, 0);
        c1.divide();
    }
}
