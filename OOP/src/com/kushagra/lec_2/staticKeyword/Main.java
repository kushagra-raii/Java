package com.kushagra.lec_2.staticKeyword;

public class Main {
    public static void main(String[] args) {
        Human kushagra = new Human(19,"Kushagra Rai",10000,false);
        Human karan = new Human(49,"Karan Sharma",40000,true);
        System.out.println(Human.population);
    }
}