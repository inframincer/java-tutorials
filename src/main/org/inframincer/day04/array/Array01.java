package org.inframincer.day04.array;

public class Array01 {

    public static void main(String[] args) {

        String[] strings = {"A", "B", "C"};
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);
        System.out.println("strings.length : " + strings.length);
        System.out.println("strings[0].length : " + strings[0].length());

        String[] strings2 = new String[3];
        strings2[0] = "a";
        strings2[1] = "b";
        strings2[2] = "c";

        System.out.println(strings2[0]);
        System.out.println(strings2[1]);
        System.out.println(strings2[2]);
    }
}
