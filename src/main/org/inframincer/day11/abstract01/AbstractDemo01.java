package org.inframincer.day11.abstract01;

abstract class Abstract01 {
    public abstract void abstractMethod();

    public void concreteMethod() {
        System.out.println("concreteMethod");
    }
}

public class AbstractDemo01 {
    public static void main(String[] args) {
        // 'Abstract01' is abstract; cannot be instantiated
        // Abstract01 abstract01 = new Abstract01();
    }
}
