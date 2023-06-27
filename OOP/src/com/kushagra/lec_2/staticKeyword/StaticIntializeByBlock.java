package com.kushagra.lec_2.staticKeyword;

public class StaticIntializeByBlock {
    static int a = 5;
    static int b;
    static {
        System.out.println("I am in static block will only run once");
        b = a * 5;
    }

    public static void main(String[] args) {
        System.out.println(StaticIntializeByBlock.a);
        System.out.println(StaticIntializeByBlock.b);


    }
}
