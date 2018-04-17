package com.akshaybijawe.designpatterns.observer;

/**
 * @author arbijawe on 4/16/18
 * @project designpatterns
 */

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,50,26.4f);


    }
}
