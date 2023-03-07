package com.cybertek.testHome.junit;

import org.junit.jupiter.api.*;

public class LifeCycleAnnotationDemoTest {

    @BeforeAll
    public static void init() {
        System.out.println("@BeforeAll block is running once");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("before each");
    }


    @Test
    public void test1() {
        System.out.println("Test 1 passed");
    }

    @Test
    public void test2() {
        System.out.println("Test 2 passed");
    }

    @AfterAll
    public static void after(){

        System.out.println("AfterAll is running once");
    }

    @AfterEach
    public void teardown(){
        System.out.println("close browser");
    }

}
