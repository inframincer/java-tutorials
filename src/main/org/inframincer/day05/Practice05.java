package org.inframincer.day05;

import java.util.Scanner;

public class Practice05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
