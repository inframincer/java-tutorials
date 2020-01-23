package org.inframincer.day03;

public class TypeConversion {

    public static void main(String[] args) {

        //float 를 double 로 자동 형변환
        double a = 3.0F;

        // double 을 float 를 변환할 수 없음
//        float a = 3.0;

        int aa = 3;
        float bb = 1.0F;

        // 우항의 결과는 float
        // 대입연산자를 통해서 cc 에 넣고 cc 는 double 이므로 자동 형변환됨
        double cc = aa + bb;

        // 명시적 형변환
        float aaa = (float) 100.0;
        int bbb = (int) 100.0F;
    }
}
