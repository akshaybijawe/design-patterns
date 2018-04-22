package com.akshaybijawe.designpatterns.decorator;

/**
 * @author arbijawe on 4/21/18
 * @project designpatterns
 */

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return 0.20  + beverage.cost();
    }
}
