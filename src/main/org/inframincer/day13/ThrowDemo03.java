package org.inframincer.day13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class B03 {
    void run() throws IOException {
        BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        String input = bReader.readLine();
        System.out.println(input);
    }
}

class C03 {
    void run() throws IOException {
        B03 b = new B03();
        b.run();
    }
}

public class ThrowDemo03 {
    public static void main(String[] args) {
        C03 c = new C03();
        try {
            c.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
