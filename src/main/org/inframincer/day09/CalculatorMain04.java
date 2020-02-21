package org.inframincer.day09;

public class CalculatorMain04 {

    void A(String arg1, String arg2) {
        System.out.println("sub class : void A (String arg1, String arg2)");
    }

    void A() {
        System.out.println("sub class : void A ()");
    }

    public static void main(String[] args) {
        CalculatorMain04 od = new CalculatorMain04();
        od.A();
//        od.A(1);
//        od.A("coding");
        od.A("", "");

    }
}
