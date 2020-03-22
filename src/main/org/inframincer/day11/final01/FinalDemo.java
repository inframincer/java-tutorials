package org.inframincer.day11.final01;

class Calculator {
    static final double PI = 3.14;
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
        // Cannot assign a value to final variable 'PI'
        // Calculator.PI = 6;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class CalculatorDemo {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        //Calculator.PI = 10;
    }
}

class A {
    void b() {
    }
}

class B extends A {
    // 'b()' cannot override 'b()' in 'org.inframincer.day11.final01.A'; overridden method is final
    void b() {}
}

final class C {
    final void b() {
    }
}

// Cannot inherit from final 'org.inframincer.day11.final01.C'
//class D extends C {}

public class FinalDemo {

    public static void main(String[] args) {
        B b = new B();
        b.b();
    }
}
