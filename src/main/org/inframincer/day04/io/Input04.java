package org.inframincer.day04.io;

import java.util.Scanner;

public class Input04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            System.out.println(input);
        }
        scanner.close();
    }
}
