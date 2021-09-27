package com.cybertek.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // declare properties at class level so it can be accesseble in static method

    private static Properties properties = new Properties();
    // we want to anly load the file once , so we can use ststic block
    static {
        FileInputStream in = null;
        try {
            in = new FileInputStream("config.properties");
            properties.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static String read (String key){
        return properties.getProperty(key);
    }
}
