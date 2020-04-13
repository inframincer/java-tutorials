package org.inframincer.day12.polymorphism;

class Polymorphism05A {
    public String x() {
        return "x";
    }
}

class Polymorphism05B1 extends Polymorphism05A {
    public String x() {
        return "Polymorphism05B1.x";
    }

    public String y() {
        return "y";
    }
}

class Polymorphism05B2 extends Polymorphism05A {
    public String x() {
        return "Polymorphism05B2.x";
    }
}

public class PolymorphismDemo05 {
    public static void main(String[] args) {
        Polymorphism05A polymorphism05A1 = new Polymorphism05B1();
        Polymorphism05A polymorphism05A2 = new Polymorphism05B2();
        System.out.println(polymorphism05A1.x());
        System.out.println(polymorphism05A2.x());
    }
}


