package com.kushagra.Lec_5.Interfaces.ExtendsDemo;

public interface B extends A {
    void greet();
    default void abc(){
        System.out.println("Hey I am default");
    }
}
