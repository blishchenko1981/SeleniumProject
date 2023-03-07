package com.cybertek.testHome.utilityPractice;

public class BrowserUtil {

    public static void waitFor(int seconds){
      try {
          Thread.sleep(seconds * 1000);
      }catch (InterruptedException e){
          e.printStackTrace();
      }
    }
}
