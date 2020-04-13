package org.inframincer.day12.polymorphism;

class Polymorphism01 {
    public void a(int param) {
        System.out.println("숫자출력 : " + param);
    }

    public void a(String param) {
        System.out.println("문자출력 : " + param);
    }
}

public class PolymorphismDemo01 {
    public static void main(String[] args) {
        Polymorphism01 polymorphism01 = new Polymorphism01();
        polymorphism01.a(1);
        polymorphism01.a("one");
    }
}
