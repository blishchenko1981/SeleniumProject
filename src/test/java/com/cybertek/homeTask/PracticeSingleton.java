package com.cybertek.homeTask;

public class PracticeSingleton {

    private static PracticeSingleton object;

    private PracticeSingleton(){};

    public static PracticeSingleton getObject(){

        if(object == null){
            return (object = new PracticeSingleton());
        }else {
            return object;
        }

    }

        }






