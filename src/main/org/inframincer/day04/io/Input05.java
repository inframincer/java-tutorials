package org.inframincer.day04.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input05 {

    public static void main(String[] args) {
        try {
            File file = new File("out.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                System.out.println(input);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
