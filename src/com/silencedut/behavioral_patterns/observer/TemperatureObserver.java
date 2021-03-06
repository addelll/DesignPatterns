package com.silencedut.behavioral_patterns.observer;

/**
 * Created by SilenceDut on 16/6/27.
 */

 class TemperatureObserver implements Observer {
    Subject mSubject;
    TemperatureObserver(Subject subject) {
        this.mSubject = subject;
        mSubject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("TemperatureObserver update");
    }

    public void removeObserver() {
        mSubject.removeObserver(this);
    }

}
