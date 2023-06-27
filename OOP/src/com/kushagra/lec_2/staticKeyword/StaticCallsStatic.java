package com.kushagra.lec_2.staticKeyword;

public class StaticCallsStatic {
    public static void main(String[] args) {
        StaticCallsStatic obj = new StaticCallsStatic();
//        greeting(); //ERROR: Non-static method 'greeting()' cannot be referenced from a static context
        obj.greeting();
    }
    void greeting(){
        System.out.println("Hello World!");
    }
}
