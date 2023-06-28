package com.kushagra.lec_3.Inheritance;

public class Box {
     float l;
     float h;
     float w;

     Box(){
         this.l = -1;
         this.h = -1;
         this.w  = -1;
     }

     Box(float side){
         this.l = side;
         this.h = side;
         this.w = side;
     }

     Box(float l, float h, float w){
         this.l = l;
         this.h = h;
         this.w = w;
     }

     Box(Box old){
         this.l = old.l;
         this.h = old.h;
         this.w = old.w;
     }
     public void displayInfo(){
         System.out.print("Length = " + this.l + " Height = " + this.h + " Width = " + this.w + " ");
     }
}
