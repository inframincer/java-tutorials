package org.inframincer.day12.polymorphism;

class Polymorphism04A {
    public String x() {
        return "x";
    }
}

class Polymorphism04B extends Polymorphism04A {
    public String x() {
        return "Polymorphism04B.x";
    }

    public String y() {
        return "y";
    }
}

public class PolymorphismDemo04 {
    public static void main(String[] args) {
        Polymorphism04A polymorphism = new Polymorphism04B();
        System.out.println(polymorphism.x());
        // Cannot resolve method 'y' in 'Polymorphism04B'
//         polymorphism.y();
    }
}
