package org.inframincer.day13;

class A02 {
    private int[] arr = new int[3];

    A02() {
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }

    public void z(int first, int second) {
        System.out.println(arr[first] / arr[second]);
    }
}

public class ExceptionDemo02 {
    public static void main(String[] args) {
        A02 a = new A02();
        a.z(1, 0);
    }
}
