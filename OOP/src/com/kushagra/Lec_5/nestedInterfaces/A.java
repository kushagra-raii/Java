package com.kushagra.Lec_5.nestedInterfaces;

public class A {
    public interface NestedInterface{
        boolean idOdd(int num);
    }
}
 class B implements A.NestedInterface{
    @Override
    public boolean idOdd(int num) {
        return (num&1)==1;
    }
}
class Main{
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.idOdd(4));
    }
}