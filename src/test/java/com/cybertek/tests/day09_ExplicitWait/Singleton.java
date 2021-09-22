package com.cybertek.tests.day09_ExplicitWait;

public class Singleton {
    static String word = "my only value";

    private static Singleton obj;


    private Singleton() {

    }

    public static Singleton getObj() {
        if (obj == null) {
            obj = new Singleton();
            return obj;
        } else {
            return obj;
        }
    }


}
