package org.inframincer.day03;

public class Condition {

    public static void main(String[] args) {
        // if
        if (true) {
            System.out.println("result : true");
        }
        if (false) {
            System.out.println("result : false");
        }

        // if ~ else
        if (true) {
            System.out.println("result : true");
        } else {
            System.out.println("result : false");
        }


        // if ~ else if ~ else
        if (false) {
            System.out.println(1);
        }
        if (true) {
            System.out.println(2);
        }
        if (true) {
            System.out.println(3);
        }

        if (false) {
            System.out.println(1);
        } else if (true) {
            System.out.println(2);
        } else if (true) {
            System.out.println(3);
        }

        if (false) {
            System.out.println(1);
        } else if (true) {
            System.out.println(2);
        } else if (true) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
