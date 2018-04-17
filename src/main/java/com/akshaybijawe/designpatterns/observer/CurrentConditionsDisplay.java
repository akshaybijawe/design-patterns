package com.akshaybijawe.designpatterns.observer;

/**
 * @author arbijawe on 4/16/18
 * @project designpatterns
 */

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current Conditions: " + temperature + " F degrees and " + humidity + "% humidity.");
    }


}
