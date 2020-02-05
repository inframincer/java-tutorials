package org.inframincer.day05;

import java.util.Scanner;

public class Practice06 {

    /**
     *      *
     *     **
     *    ***
     *   ****
     *  *****
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = input - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
