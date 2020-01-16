package org.inframincer.day02;

public class Variable {

    public static void main(String[] args) {

//        int a; // 선언
//        a = 1; // 할당

        int a = 1; // 변수 선언과 할당
        System.out.println(a + 1);

        a = 2; // 재할당
        System.out.println(a + 1);

//        int a = 2; // error 같은 스코프에서 같은 이름으로 선언이 안됨

        // 상수는 파이
        final int b;
        b = 1;
//        b = 2; // 상수는 재할당 안됨
    }
}
