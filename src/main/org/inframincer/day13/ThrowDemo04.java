package org.inframincer.day13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class B04 {
    void run() throws FileNotFoundException, IOException {
        BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        String input = bReader.readLine();
        System.out.println(input);
    }
}

class C04 {
    void run() {
        B04 b = new B04();
        try {
            b.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class ThrowDemo04 {
    public static void main(String[] args) {
        C04 c = new C04();
        c.run();
    }
}
