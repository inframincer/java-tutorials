package org.inframincer.day05;

import java.util.Scanner;

public class Practice01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strings = input.split(" ");
        for (String element : strings) {
            if (element.equals("0")) {
                break;
            }
            System.out.println(element);
        }
    }
}
