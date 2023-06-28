package com.kushagra.lec_3.Inheritance;

public class BoxWeight extends Box {
    float weight;

    public BoxWeight(){
        this.weight= -1;
    }

    public BoxWeight(float l, float h, float w, float weight) {
        super(l, h, w);
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

    public void displayWithWeight(){
        super.displayInfo();
        System.out.println("Weight = " + this.weight);
    }
}
