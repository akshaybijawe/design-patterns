package com.akshaybijawe.designpatterns.singleton.threadsafe;

/**
 * @author arbijawe on 4/21/18
 * @project designpatterns
 */

//Not thread safe

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton(){};

    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription(){
        return "I'm a thread safe Singleton!";
    }
}
