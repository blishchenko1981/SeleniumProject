package com.cybertek.day6_junit_practice_utility_methods;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AssertFalseTest {

    @Test
    public void testNum(){

        int num = 10 ;

        //asser to checkif num>9
        assertTrue(num>9);


        // is not less than5
        assertTrue(! (num<5));

        assertFalse(num<5);


    }



}
