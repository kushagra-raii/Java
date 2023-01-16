import java.util.Scanner;
//
public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

//        loops
//        Problem 1 : Sum of n number
        int n = scr.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println(sum);

//        problem 2 Sum stream of integer
        int nu=0,summ=0;
        while (nu!=-1){
            summ = summ +nu;
            nu = scr.nextInt();
        }
        System.out.println(summ);

        //    problem 3 : print first multiple of 5 && 7
        for (int i =1;true;i++){
            if (i%5==0 && i%7==0){
                System.out.println(i);
                break;
            }
        }

//        Problem 4 : print no. from 1 to 50 except multiple of 3
        for (int i=1;i<=50;i++){
            if (i%3==0){
                continue;
            }
            else System.out.println(i);
        }

//        problem 5 :count no. of digit in a number
        int digit = scr.nextInt();
        int ii;
        for ( ii =0;digit!=0;ii++){
            digit = digit/10;
        }
        System.out.println(ii);


//    problem 6: sum of digit in a number
        int digitx = scr.nextInt();
        int l,sumOfDigit=0,temp;

        for (l=0;digitx!=0;l++){
            temp = digitx%10;
            digitx = digitx/10;
            sumOfDigit = sumOfDigit + temp;
        }
        System.out.println(sumOfDigit);

//        problem 7: Reverse the digits in a number
        int digitxy = scr.nextInt();
        int x,mul=0,tempo;

        for (x=0;digitxy!=0;x++){
            tempo = digitxy%10;
            mul = mul *10 +tempo;
            digitxy = digitxy/10;
        }
        System.out.println(mul);


//        problem 8: sum = 1-2+3-4+5...n
        int jj,numb= scr.nextInt(),ans=0;
        for (jj=1;jj<=numb;jj++){
            if (jj%2==1) ans = ans +jj;
            else ans = ans-jj;
        }
        System.out.println(ans);


//        Problem 9:factorial
        int number = scr.nextInt(),mult=1;
        for (int f=1;f<=number;f++){
            mult *=f;
        }
        System.out.println(mult);

//        problem 10:a raise to b
        int a= scr.nextInt(),b= scr.nextInt(),multi=1;
        for (int h=1;h<=b;h++){
            multi*=a;
        }
        System.out.println(multi);


//        problem 11:rectangle Pattern
        System.out.println("Column");
        int c = scr.nextInt();
        System.out.println("row");
        int r = scr.nextInt();
        for (int i =1;i<=c;i++){
            for(int j =1;j<=r;j++){
                System.out.print("*");
     }
            System.out.println("");
    }

//        problem 12:hollow rectangular pattern
        for (int i =1;i<=c;i++){
            for(int j =1;j<=r;j++){
                if (i==1||i==c||j==1||j==r){
                    System.out.print("*");

                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

//        problem 13: triangle
        for (int i = 1;i<=r;i++){
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }


//        problem 14: inverted triangle
        for (int i = 1;i<=r;i++){
            for (int j =1;j<=(r+1)-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = r;i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

//        problem 15: Pyramid
        for (int i = 1;i<=r;i++){
            for (int j =1;j<=(r-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

//        problem 15: Reverse Pyramid
        for (int i = 1;i<=r;i++){
            for (int j =1;j<=i-1;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*(r-i)+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

//        problem 15: Reverse Triangle
        for (int i = 1;i<=r;i++){
            for (int j =1;j<=i-1;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=(r-i)+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }


//        problem 16: number pattern I
        for (int i =1;i<=r;i++){
            for (int j=i; j<=r;j++){
                   System.out.print(j);
            }
            for (int j =1;j<=i-1;j++){
                System.out.print(j);
            }
            System.out.println("");
        }


//        problem 17: number pattern II
        for (int i=1;i<=r;i++){
            for (int j=1;j<=c;j++){
                System.out.print(j);
            }
            System.out.println();
        }

//        problem 18: number pattern III
        for (int i=1;i<=r;i++){
            for (int j=1;j<=c;j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }
                else System.out.print("2");
            }
            System.out.println();
        }

//        problem 19:number pattern IV (triangle)
        for (int i = 1;i<=r;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }


//        problem 20:number pattern V (pyramid)
        for (int i =1;i<=r;i++){
            for (int j = 1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for (int j = (i-1);j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

//        problem 21: hollow number pattern (pyramid)
        for (int i=1;i<=r;i++){
            for (int j = 1;j<=r-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                if (j==1){
                    System.out.print(i);
                } else if (j==2*i-1) {
                    System.out.print(i);
                } else if (i==r) {
                    System.out.print(i);

                } else System.out.print(" ");
            }
            System.out.println();
        }
//
//        problem 22:Fibonacci Series
        int ekno =1;
        int dusrano =1;

        System.out.print(ekno + " " + dusrano + " ");
        for (int i = 2; i < r; i++) {
            int tisrano = ekno + dusrano;
            System.out.print(tisrano + " ");
            ekno = dusrano;
            dusrano = tisrano;
        }


//        problem 23:Cross Pattern
        int noOfRow = scr.nextInt();
        for (int i =1;i<=noOfRow;i++){
            for (int j =1;j<=noOfRow;j++){
                if (i==j||i==noOfRow+1-j){
                    System.out.print("*");

                }
                else System.out.print(" ");
            }
            System.out.println("");
        }





//        problem 24:K Pattern

           for (int i =1;i<=noOfRow;i++){
            for (int j =1;j<=noOfRow;j++){
                if (1==j||i==((noOfRow-3)/2)+j||i==((noOfRow+5)/2)-j){
                    System.out.print("*");

                }
                else System.out.print(" ");
            }
            System.out.println("");
        }







    }
}
//
