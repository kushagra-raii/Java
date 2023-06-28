package com.kushagra.Lec_5.Interfaces;

public class Car implements Engine, Brake,Media {
    @Override
    public void brake() {
        System.out.println("Car brake");
    }

    @Override
    public void start() {
        System.out.println("Car start");

    }

    @Override
    public void stop() {
        System.out.println("Car stop");

    }

    @Override
    public void acc() {
        System.out.println("Car acc");

    }
}
