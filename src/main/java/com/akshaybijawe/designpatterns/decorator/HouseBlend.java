package com.akshaybijawe.designpatterns.decorator;

/**
 * @author arbijawe on 4/21/18
 * @project designpatterns
 */

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
