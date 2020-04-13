package org.inframincer.day12.polymorphism;

class 포유류 {
    public void bark() {
        System.out.println("포유류.bark");
    }
}

class 강아지 extends 포유류 {
    public void bark() {
        System.out.println("강아지.bark");
    }
}

class 여우 extends 포유류 {
    public void bark() {
        System.out.println("여우.bark");
    }
}

public class PolymorphismDemo10 {
    public static void main(String[] args) {
        포유류 포유류1 = new 포유류();
        포유류1.bark();

        강아지 꾸미 = new 강아지();
        꾸미.bark();

        여우 fox = new 여우();
        fox.bark();

        포유류 꾸미친구미소 = new 강아지();
        꾸미친구미소.bark();
    }
}
