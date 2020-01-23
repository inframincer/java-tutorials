package org.inframincer.day03;

public class For {

    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("while 2bmk " + i);
            i++;
        }

        for (int ii = 0; ii < 10; ii++) {
            System.out.println("for 2bmk " + ii);
        }

        for (int iii = 5; iii < 50; iii = iii + 2) {

            if (iii == 17) {
                continue;
            }
            System.out.println("2bmk " + iii);
        }
    }
}
