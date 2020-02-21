package org.inframincer.day09;

public class CalculatorMain03 {

    void A() {
        System.out.println("void A()");
    }

//    int A() {
//        System.out.println("void A()");
//    }

    void A(int arg1) {
        System.out.println("void A (int arg1)" + arg1);
    }

    void A(String arg1) {
        System.out.println("void A (String arg1)");
    }

    public static void main(String[] args) {
        CalculatorMain03 od = new CalculatorMain03();
        od.A();
        od.A(1);
        od.A("coding");
    }
}
