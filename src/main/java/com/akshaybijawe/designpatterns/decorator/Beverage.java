package com.akshaybijawe.designpatterns.decorator;

/**
 * @author arbijawe on 4/21/18
 * @project designpatterns
 */

public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
