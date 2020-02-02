package org.inframincer.day05;

import java.util.Scanner;

public class Practice02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = input - 1; i >= 0; i--) {
            System.out.println(i);
        }
        for (int i = input; i > 0; i--) {
            System.out.println(i);
        }
    }
}
