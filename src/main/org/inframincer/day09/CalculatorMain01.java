package org.inframincer.day09;

class Calculator01 {
    int left, right;

    public Calculator01(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubtractionAbleCalculator01 extends Calculator01 {

    public static final String TAG = SubtractionAbleCalculator01.class.getName();

    public SubtractionAbleCalculator01(int left, int right) {
        super(left, right);
    }

    public void sum() {
        // 부모클래스를 실행하고,
        super.sum();
        // 하위클래스에서 기능들을 추가 할 수 있음
        System.out.println(TAG);
        System.out.println(this.left + this.right);
    }

    public void sum(int aaa) {
        System.out.println(this.left + this.right + aaa);
    }

    public void subtraction() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorMain01 {

    public static void main(String[] args) {
        SubtractionAbleCalculator01 c1 = new SubtractionAbleCalculator01(10, 20);
        c1.avg();
        c1.sum();
        c1.sum(1);
        c1.subtraction();

        Calculator01 c2 = new SubtractionAbleCalculator01(20, 30);
        // 자식 클래스에 없다면 부모클래스의 메소드가 실행되지만,
        // c2 가 부모클래스의 인스턴스라도, 자식클래스의 인스턴스로 생성되어었으므로, 우선순위는 자식클래스에 선언된 메소드가 실행됨.
        c2.sum();
    }
}
