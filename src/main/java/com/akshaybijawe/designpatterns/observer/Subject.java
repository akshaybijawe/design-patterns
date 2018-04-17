package com.akshaybijawe.designpatterns.observer;

/**
 * @author arbijawe on 4/16/18
 * @project designpatterns
 */

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
