package com.kushagra.lec_6.generics;

import java.util.Arrays;

public class CustomGenericArraylist <T>{
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArraylist() {
        data = new Object[DEFAULT_SIZE];
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];
        for (int i = 0;i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public void add(T num) {
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }
    public T remove(){
        return (T)(data[--size]);
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericArraylist<Integer> list = new CustomGenericArraylist<>();
        for (int i = 0;i<15;i++){
            list.add(2*i+1);
        }
        System.out.println(list);

    }
}
