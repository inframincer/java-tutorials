package org.inframincer.day12.interface04;

interface I3 {
    public void x();
}

interface I4 extends I3 {
    public void z();
}

public class B implements I4 {
    public void x() {
    }

    public void z() {
    }
}
