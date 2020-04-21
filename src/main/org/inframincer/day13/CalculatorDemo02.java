package org.inframincer.day13;

class Calculator02 {
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
        } catch (Exception e) {
            System.out.println("오류가 발생했습니다 : " + e.getMessage());
        }
    }
}

public class CalculatorDemo02 {
    public static void main(String[] args) {
        Calculator02 c2 = new Calculator02();
        c2.setOperands(10, 0);
        c2.divide();
    }
}
