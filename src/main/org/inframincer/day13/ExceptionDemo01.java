package org.inframincer.day13;

class A01 {
    private int[] arr = new int[3];

    A01() {
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }

    public void z(int first, int second) {
        System.out.println(arr[first] / arr[second]);
    }
}

public class ExceptionDemo01 {
    public static void main(String[] args) {
        A01 a = new A01();
        a.z(10, 1);
    }
}
