package org.inframincer.day09;

import java.util.Scanner;

public class Practice01 {

    /**
     * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=197&sca=1090
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");

        int minValue = 1000;
        for (String str : array) {
            int number = Integer.parseInt(str);
            if (minValue > number) {
                minValue = number;
            }
        }
        System.out.println(minValue);
    }
}
