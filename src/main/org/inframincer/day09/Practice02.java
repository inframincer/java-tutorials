package org.inframincer.day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice02 {

    /**
     * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=199&sca=1090
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");

        Practice02 practice02 = new Practice02();
        practice02.method01(array);
        System.out.println("====================");
        practice02.method02(array);
        System.out.println("====================");
        practice02.method03(array);
    }

    public void method01(String[] array) {
        int 짝수번째의합 = 0;
        int 홀번째의합 = 0;
        int 홀수번째나누기의분모 = 0;

        for (int i = 1; i <= array.length; i++) {
            int number = Integer.parseInt(array[i - 1]);
            if (i % 2 == 0) {
                짝수번째의합 += number;
            } else {
                홀번째의합 += number;
                ++홀수번째나누기의분모; // 홀수번째나누기의분모 = 홀수번째나누기의분모 + 1;
            }
        }

        System.out.println("sum : " + 짝수번째의합);
        System.out.println("avg : " + 홀번째의합 / (float) 홀수번째나누기의분모);
    }

    public void method02(String[] array) {
        int[] 짝수번째s = new int[5];
        int[] 홀수번째s = new int[5];

        for (int i = 1; i <= array.length; i++) {
            int number = Integer.parseInt(array[i - 1]);
            if (i % 2 == 0) {
//                i  = 2    => 0
//                i  = 4    => 1
//                i  = 6    => 2
                짝수번째s[(i / 2) - 1] = number;
            } else {
//                i  = 1    => 0
//                i  = 3    => 1
//                i  = 5    => 2
                홀수번째s[i / 2] = number;
            }
        }
        Calculator05 c = new Calculator05();
        c.setOperands(짝수번째s);
        c.sum();
        System.out.println("sum : " + c.sum());

        c.setOperands(홀수번째s);
        System.out.println("avg : " + c.sum() / (float) 홀수번째s.length);
    }

    public void method03(String[] array) {
        List<Integer> 짝수번째list = new ArrayList<>();
        List<Integer> 홀수번째list = new ArrayList<>();
        for (int i = 1; i <= array.length; i++) {
            int number = Integer.parseInt(array[i - 1]);
            if (i % 2 == 0) {
                짝수번째list.add(number);
            } else {
                홀수번째list.add(number);
            }
        }

        int 짝수번째합 = 0;
        for (int number : 짝수번째list) {
            짝수번째합 += number;
        }

        int 홀수번째합 = 0;
        for (int number : 홀수번째list) {
            홀수번째합 += number;
        }

        System.out.println("sum : " + 짝수번째합);
        System.out.println("avg : " + 홀수번째합 / (float) 홀수번째list.size());
    }
}
