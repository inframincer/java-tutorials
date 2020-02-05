package org.inframincer.day05;

import java.util.Scanner;

public class Practice04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        drawTriangle1(input);
        drawTriangle2(input);
        drawReverseTriangle1(input);
        drawReverseTriangle2(input);
    }

    /**
     * *
     * **
     * ***
     */
    public static void drawTriangle1(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *   *
     *  **
     * ***
     */
    public static void drawTriangle2(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * ***
     * **
     * *
     */
    public static void drawReverseTriangle1(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * ***
     *  **
     *   *
     */
    public static void drawReverseTriangle2(int length) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < length - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
