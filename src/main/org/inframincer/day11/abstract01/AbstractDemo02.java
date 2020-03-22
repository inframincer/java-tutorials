package org.inframincer.day11.abstract01;

abstract class Abstract02 {
    public abstract void abstractMethod();

    public void concreteMethod() {
        System.out.println("concreteMethod");
    }
}

// Class 'Concrete02' must either be declared abstract
// or implement abstract method 'abstractMethod()' in 'Abstract02'
class Concrete02 extends Abstract02 {
    @Override
    public void abstractMethod() {

    }
}

public class AbstractDemo02 {
    public static void main(String[] args) {
        // 'Abstract02' is abstract; cannot be instantiated
        // Abstract02 abstract02 = new Abstract02();
        Concrete02 concrete02 = new Concrete02();
        concrete02.abstractMethod();
    }
}
