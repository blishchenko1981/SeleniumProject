package com.cybertek.testHome.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    public void testAddition(){
        int num1 = 10;
        int num2 = 7;
        int expectedResult = 117;
        Assertions.assertTrue(num1+ num2 == expectedResult);
        Assertions.assertEquals(expectedResult, num1+num2);
    }

    @Test
    public void testString(){

        String message = "I love Selenium";
        // assert this message equal "I love Selenium"

        Assertions.assertEquals("I love Selenium", message);

        // assert this mag starts with "I love"

        Assertions.assertTrue(message.startsWith("I love"));

    }


}
