package com.kushagra.lec_2.staticKeyword;

public class InnerClasses {
    static class Test{
        String name;
         public Test(String name){
             this.name = name;
         }
    }
    public static void main(String[] args) {
        Test obj = new Test("kushagra");
    }
}