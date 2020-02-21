package org.inframincer.day09;

class Calculator05 {
    int[] operands;

    public void setOperands(int[] operands) {
        this.operands = operands;
    }

    public int sum() {
        int total = 0;
        for (int value : this.operands) {
//            total += value;
            total = total + value;
        }
//        System.out.println(total);
        return total;
    }

    public void avg() {
        int total = 0;
        for (int value : this.operands) {
            total += value;
        }
        System.out.println(total / this.operands.length);
    }
}

public class CalculatorMain05 {
    public static void main(String[] args) {
        Calculator05 c1 = new Calculator05();
        c1.setOperands(new int[]{10, 20});
        c1.sum();
        c1.avg();
        c1.setOperands(new int[]{10, 20, 30});
        c1.sum();
        c1.avg();
    }
}
