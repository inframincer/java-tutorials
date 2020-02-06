package org.inframincer.day07;

class Calculator04 {

    static int staticVariable = 1;
    int instanceVariable = 2;

    static void staticStatic() {
        System.out.println(staticVariable);
    }

    static void staticInstance() {
//        System.out.println(instanceVariable);
    }

    void instanceStatic() {
        System.out.println(staticVariable);
    }

    void instanceInstance() {
        System.out.println(instanceVariable);
    }
}

public class CalculatorMain04 {

    public static void main(String[] args) {
        Calculator04 c = new Calculator04();
        c.staticStatic();
        c.staticInstance();
        c.instanceStatic();
        c.instanceInstance();
        Calculator04.staticStatic();
        Calculator04.staticInstance();
//        Calculator04.instanceStatic();
//        Calculator04.instanceInstance();
    }
}
