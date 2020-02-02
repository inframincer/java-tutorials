package org.inframincer.day05;

import java.util.Scanner;

public class Practice03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int result = 0;
        for (int i = 1; i <= input; i++) {
            if (i % 2 == 0) {
                result = result + i; // result += i;
            }
        }
        System.out.println(result);
    }
}
