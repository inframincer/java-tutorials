package org.inframincer.day04.method;

public class Method01 {

    public static void main(String[] args) {
        numbering10();
        numbering10();
        numberingCount(1);
        numberingCount(10);
    }

    public static void numbering10() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void numberingCount(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(i);
        }
    }
}
