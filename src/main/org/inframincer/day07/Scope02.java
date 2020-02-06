package org.inframincer.day07;

public class Scope02 {

    static int i;

    static void a() {
        i = 0;
    }

    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
}
