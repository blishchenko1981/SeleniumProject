package com.cybertek.part1;

import org.junit.jupiter.api.Test;

public class StringAssign {
    public String word1;
    public String word2;

    public static void main(String[] args) {
        StringAssign a = new StringAssign();
        a.word1 += "hello";
        a.word2 = "hello" ;

        System.out.println("word1 = " + a.word1);
        System.out.println("a.word2 = " + a.word2);

    }

}

