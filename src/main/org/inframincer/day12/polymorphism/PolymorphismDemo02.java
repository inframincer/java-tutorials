package org.inframincer.day12.polymorphism;

class Polymorphism02A {
    public void aaa() {
        System.out.println("Polymorphism02A.aaa");
    }

    public void bbb() {
        System.out.println("Polymorphism02A.bbb");
    }
}

class Polymorphism02B extends Polymorphism02A {
    public void aaa() {
        System.out.println("Polymorphism02B.aaa");
    }

    public void bbb() {
        System.out.println("Polymorphism02B.bbb");
    }

    public void ccc() {
        System.out.println("Polymorphism02B.ccc");
    }
}

public class PolymorphismDemo02 {
    public static void main(String[] args) {
        // 클래스 Polymorphism02B 이것으로 인스턴스를 만들었지만, Polymorphism02A 의 데이터 타입임,
        Polymorphism02A polymorphism1 = new Polymorphism02A();
        polymorphism1.aaa();
        polymorphism1.bbb();
        System.out.println();

        Polymorphism02A polymorphism2 = new Polymorphism02B();
        polymorphism2.aaa();
        polymorphism2.bbb();
        System.out.println();

        Polymorphism02B polymorphism3 = new Polymorphism02B();
        polymorphism3.aaa();
        polymorphism3.bbb();
        polymorphism3.ccc();
        System.out.println();
    }
}
