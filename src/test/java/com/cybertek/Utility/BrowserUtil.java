package com.cybertek.Utility;

public class BrowserUtil {

    // a method to pause the thead certain seconds
    public static void waitFor(int second){
        try {
            Thread.sleep(second *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
