package org.inframincer.day12.interface03;

class Calculator implements Calculable {
    int first, second, third;

    public void setOperands(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public int sum() {
        return this.first + this.second + this.third;
    }

    public int avg() {
        return (this.first + this.second + this.third) / 3;
    }
}

public class CalculatorConsumer02 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setOperands(10, 20, 30);
        System.out.println(c.sum() + c.avg());
    }
}
