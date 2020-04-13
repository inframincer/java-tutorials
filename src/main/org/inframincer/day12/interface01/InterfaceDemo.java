package org.inframincer.day12.interface01;

interface I {
    public void y();

    public void z();
}

public class InterfaceDemo implements I {

    @Override
    public void y() {
        System.out.println("y");
    }

    @Override
    public void z() {
        System.out.println("z");
    }
}
