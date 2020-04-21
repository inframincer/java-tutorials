package org.inframincer.day13;

class A03 {
    private int[] arr = new int[3];

    A03() {
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }

    public void z(int first, int second) {
        try {
            System.out.println(arr[first] / arr[second]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

public class ExceptionDemo03 {
    public static void main(String[] args) {
        A03 a = new A03();
        a.z(10, 0);
        a.z(1, 0);
        a.z(2, 1);
    }
}
