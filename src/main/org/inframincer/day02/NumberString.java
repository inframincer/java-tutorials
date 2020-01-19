package org.inframincer.day02;

public class NumberString {

    public static void main(String[] args) {
        // 숫자 계산 출력
        System.out.println("숫자 계산 출력");
        System.out.println(1 + 2);
        System.out.println(1 - 2);
        System.out.println(1 * 2);
        System.out.println(1 / 2);

        // 문자 출력
        System.out.println("문자 출력");
        System.out.println('1' + '2'); // 99
        System.out.println('1');
        System.out.println("1" + "2");

        System.out.println('1'); // char 문자 한자
        System.out.println("11"); // 문자 한자들의 배열 / 문자열

        // string escape
        System.out.println("egoing 'said' \n\"Welcome \tprogramming world\"");
    }
}
