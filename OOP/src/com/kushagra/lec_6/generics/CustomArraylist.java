package com.kushagra.lec_6.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArraylist() {
        data = new int[DEFAULT_SIZE];
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];
        for (int i = 0;i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public void add(int num) {
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }
    public int remove(){
        return data[--size];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
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
        CustomArraylist list = new CustomArraylist();
        for (int i = 0;i<15;i++){
            list.add(2*i+1);
        }
        System.out.println(list);

    }
}
