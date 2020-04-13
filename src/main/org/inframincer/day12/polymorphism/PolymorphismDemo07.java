package org.inframincer.day12.polymorphism;

interface I2 {
    public String a();
}

interface I3 {
    public String b();
}

class D implements I2, I3 {
    @Override
    public String a() {
        return "D.a";
    }

    @Override
    public String b() {
        return "D.b";
    }
}

public class PolymorphismDemo07 {
    public static void main(String[] args) {
        D obj = new D();
        I2 objI2 = new D();
        I3 objI3 = new D();

        System.out.println(obj.a());
        System.out.println(obj.b());

        System.out.println(objI2.a());
        // System.out.println(objI2.b());

        // System.out.println(objI3.a());
        System.out.println(objI3.b());
    }
}
