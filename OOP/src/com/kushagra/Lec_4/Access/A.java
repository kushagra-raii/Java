package com.kushagra.Lec_4.Access;

public class A {
    public int numPublic; // can be accessed from anywhere
    protected int numProtected; // can be accessed from same package and in subclass of other packages
    int numDefault; // can be accessed from same package
    private int numPrivate;// can be accessed from these class only we can modify it using getters/setters

    public int getNumPrivate() {
        return numPrivate;
    }

    public void setNumPrivate(int numPrivate) {
        this.numPrivate = numPrivate;
    }

}
