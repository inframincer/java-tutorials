package org.inframincer.day04.method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Method03 {

    public static void main(String[] args) {
        String output = numbering(1, 5);

        // std output
        System.out.println(output);

        // file output
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(output);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String numbering(int init, int limit) {
        int i = init;
        String output = "";
        while (i < limit) {
            output += i;
            i++;
        }

        System.out.println(output);
        output = "1234";
        return output;
    }
}
