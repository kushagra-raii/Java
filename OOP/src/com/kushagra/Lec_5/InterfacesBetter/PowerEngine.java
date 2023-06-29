package com.kushagra.Lec_5.InterfacesBetter;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stop");

    }

    @Override
    public void acc() {
        System.out.println("Power Engine Accelerate");

    }
}
