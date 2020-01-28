package org.inframincer.day04.method;

public class Method02 {

    public static void main(String[] args) {
        numbering();
        numbering();
        numbering(3);
        numbering(4);
        numbering(2, 5);
    }

    public static int numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        return 1;
    }

    public static void numbering(int limit) {
        int i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }

    public static void numbering(int init, int limit) {
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
}
