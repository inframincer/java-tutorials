package org.inframincer.day13;

class Calculator03 {
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void divide() {
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left / this.right);
            System.out.print(" 입니다.");
        } catch (ArithmeticException e) {
            // 이유
            System.out.println("\n\ne.getMessage()\n" + e.getMessage());
            // Exception class name + 이유
            System.out.println("\n\ne.toString()\n" + e.toString());
            // e.getMessage() + e.toString() + trace
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
}

public class CalculatorDemo03 {
    public static void main(String[] args) {
        Calculator03 c3 = new Calculator03();
        c3.setOperands(10, 1);
        c3.divide();

        c3.setOperands(10, 2);
        c3.divide();

        c3.setOperands(10, 0);
        c3.divide();
    }
}
