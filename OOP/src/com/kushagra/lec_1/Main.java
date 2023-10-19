package com.kushagra.lec_1;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

    Student kush = new Student(91,"Kushagra",80);

//    kush.name = "Kushagra RAi";
//    kush.marks = 88.5f;
//    kush.rollNo = 91;
//        System.out.println(kush);
        System.out.println(kush.marks);
        System.out.println(kush.name);
        System.out.println(kush.rollNo);
        Student rai = new Student(kush);
        System.out.println(rai.marks);
        System.out.println(rai.name);
        System.out.println(rai.rollNo);

        Student ram = new Student();
        System.out.println(ram.name);
        Student laks = new Student(kush);

    }
}
class Student {
    String name;
    int rollNo;
    float marks;

    Student(int rno, String name, float marks) {
        this.name = name;
        this.marks = marks;
        rollNo = rno;
    }

//    com.kushagra.lec_1.Student(){
//        this.name = "abc";
//        this.rollNo = 152;
//        this.marks = 82.4f;
//    }

    Student( Student other){
        this.name = other.name;
        this.marks = other.marks;
        this.rollNo = other.rollNo;
    }





    Student(){
//        calling constructor inside another constructor
        this(88,"Vijay",85.789f);
    }

}