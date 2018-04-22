package com.akshaybijawe.designpatterns.decorator;

/**
 * @author arbijawe on 4/21/18
 * @project designpatterns
 */

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espressor";
    }

    public double cost() {
        return 1.99;
    }
}
