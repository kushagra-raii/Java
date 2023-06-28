package com.kushagra.lec_3.Inheritance;

public class BoxPrice extends BoxWeight{
    float price;
    public BoxPrice(float l, float h, float w, float weight, float price) {
        super(l, h, w, weight);
        this.price = price;
    }

    public BoxPrice(BoxPrice other) {
        super(other);
        this.price = other.price;
    }
}
