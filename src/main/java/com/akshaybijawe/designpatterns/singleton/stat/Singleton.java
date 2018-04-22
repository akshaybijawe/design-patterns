package com.akshaybijawe.designpatterns.singleton.stat;

/**
 * @author arbijawe on 4/21/18
 * @project designpatterns
 */

public class Singleton {

    private static Singleton uniqueInstance = new Singleton();

    private Singleton(){};

    public static Singleton getInstance(){
        return uniqueInstance;
    }

    public String getDescription(){
        return "I'm a statically initialized Singleton class!";
    }
}
