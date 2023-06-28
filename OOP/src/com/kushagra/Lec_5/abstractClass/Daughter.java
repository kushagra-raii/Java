package com.kushagra.Lec_5.abstractClass;

public class Daughter extends Parent{
    @Override
    void career() {
        System.out.println("Hey I am a Doctor");
    }

    @Override
    void love() {
        System.out.println("I love Iron Man");
    }
}
