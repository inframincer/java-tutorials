package org.inframincer.day04.array;

public class Array02 {

    public static void main(String[] args) {
        String[] members = {"A", "B", "C"};
        // 1 for
        for (int i = 0; i < members.length; i++) {
            String member = members[i];
            System.out.println(member);
        }

        // 2 foreach
        for (String a : members) {
            System.out.println(a);
        }
    }
}
