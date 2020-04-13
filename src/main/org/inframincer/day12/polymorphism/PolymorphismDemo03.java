package org.inframincer.day12.polymorphism;

class Polymorphism03A {
    public String x() {
        return "x";
    }
}

class Polymorphism03B extends Polymorphism03A {
    public String y() {
        return "y";
    }
}

public class PolymorphismDemo03 {
    public static void main(String[] args) {
        Polymorphism03A polymorphism03A = new Polymorphism03B();
        System.out.println(polymorphism03A.x());
        // Cannot resolve method 'y' in 'Polymorphism03A'
//         polymorphism03A.y();
    }
}
