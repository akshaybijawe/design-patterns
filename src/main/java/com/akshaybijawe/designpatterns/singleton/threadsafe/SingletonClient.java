package com.akshaybijawe.designpatterns.singleton.threadsafe;

/**
 * @author arbijawe on 4/21/18
 * @project designpatterns
 */

public class SingletonClient {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
