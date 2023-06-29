package com.kushagra.Lec_5.InterfacesBetter;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Music Start");
    }

    @Override
    public void stop() {
        System.out.println("Music Stop");

    }
}
