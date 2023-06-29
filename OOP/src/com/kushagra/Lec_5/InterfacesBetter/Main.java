package com.kushagra.Lec_5.InterfacesBetter;

public class Main {
    public static void main(String[] args) {
        NiceCar car = new NiceCar();
        Engine electric = new ElectricEngine();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.stop();


    }
}
