package com.cybertek.tests.day09_ExplicitWait;

import com.cybertek.utility.Driver;
import org.junit.jupiter.api.Test;

public class SingletonPractice {

    @Test
    public void testoutDriverUtilityClass(){
        Driver.getDriver();
        Driver.getDriver();
        Driver.getDriver();
        Driver.getDriver();
        Driver.getDriver();
        Driver.getDriver();
    }




    @Test
    public void testSingleton(){
//        Singleton s1 = new Singleton();
//        s1.word = "abc";
//        Singleton s2 = new Singleton();
//        s1.word = "abc";

        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();
        Singleton.getObj();


    }
}
