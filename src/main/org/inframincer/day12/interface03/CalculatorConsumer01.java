package org.inframincer.day12.interface03;

class CalculatorDummy implements Calculable {
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
        return this.sum() / 3;
    }
}

public class CalculatorConsumer01 {
    public static void main(String[] args) {
        CalculatorDummy c = new CalculatorDummy();
        c.setOperands(10, 20, 30);
        System.out.println(c.sum());
        System.out.println(c.avg());
    }
}
