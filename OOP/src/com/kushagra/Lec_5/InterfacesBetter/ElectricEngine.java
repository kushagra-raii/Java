package com.kushagra.Lec_5.InterfacesBetter;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stop");

    }

    @Override
    public void acc() {
        System.out.println("Electric Engine Accelerate");

    }
}
