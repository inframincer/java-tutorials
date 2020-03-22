package org.inframincer.day11.modifier01;

class Modifier {
    public String x() {
        return "public String x()";
    }

    private String y() {
        return "private String y()";
    }

    public String z() {
        return y();
    }
}

public class ModifierDemo {
    public static void main(String[] args) {
        Modifier modifier = new Modifier();
        System.out.println(modifier.x());
        // 'y()' has private access
        // System.out.println(modifier.y());
        System.out.println(modifier.z());
    }
}
