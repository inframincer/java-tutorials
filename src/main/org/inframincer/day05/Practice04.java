package org.inframincer.day05;

import java.util.Scanner;

public class Practice04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        drawRectangle(input);
        drawReverseRectangle(input);
    }

    /**
     *
     * *
     * **
     * ***
     */
    public static void drawRectangle(int length) {
        for (int i = 0; i < length; i++) {
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
    public static void drawReverseRectangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
