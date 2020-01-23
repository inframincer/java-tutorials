package org.inframincer.day03;

public class UnaryOperator {

    public static void main(String[] args) {
        int i = 3;
        i++; // i = i + 1;
        System.out.println(i); // 4 출력
        ++i; // i = i + 1;
        System.out.println(i); // 5 출력
        System.out.println(++i); // 6 출력
        System.out.println(i++); // 6 출력
        System.out.println(i); // 7 출력

        int j = 3;
        j--; // j = j - 1;
        System.out.println(j); // 2
        --j; // j = j - 1;
        System.out.println(j); // 1

        System.out.println(--j); // 0
        System.out.println(j--); // 0
        System.out.println(j); // -1
    }
}
