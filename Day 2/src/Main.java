import java.util.Scanner;

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
            summ = summ +n;
            n = scr.nextInt();
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
        int i;
        for ( i =0;digit!=0;i++){
            digit = digit/10;
        }
        System.out.println(i);


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
            digitx = digitxy/10;
        }
        System.out.println(mul);


//        problem 8: sum = 1-2+3-4+5...n
        int j,numb= scr.nextInt(),ans=0;
        for (j=1;i<=numb;j++){
            if (i%2==1) ans = ans +j ;
            else ans = ans-j;
        }
        System.out.println(ans);


//        Problem 9:factorial
        int number = scr.nextInt(),mult=1;
        for (int f=1;f<=number;f++){
            mult *=f;
        }
        System.out.println(mul);

//        problem 10:a raise to b
        int a= scr.nextInt(),b= scr.nextInt(),multi=1;
        for (int h=1;i<=b;h++){
            multi*=a;
        }
        System.out.println(mul);


//        problem 11:

       }

    }
