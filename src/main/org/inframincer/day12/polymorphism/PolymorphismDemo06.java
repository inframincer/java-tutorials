package org.inframincer.day12.polymorphism;

interface I {}

class C implements I {}

public class PolymorphismDemo06 {
    public static void main(String[] args) {
        C c1 = new C();
        I c2 = new C();
    }
}
