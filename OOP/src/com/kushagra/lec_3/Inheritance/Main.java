package com.kushagra.lec_3.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(15,14,95);
//        box.displayInfo();

        BoxWeight wBox = new BoxWeight(15,14,95,468);
        wBox.displayWithWeight();
    }
}
