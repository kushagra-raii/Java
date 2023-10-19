import java.util.Scanner;

public class Fibonacci {

    static int fibo(int n){
        if (n == 0 || n==1){
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a number for nth Fibonacci number: ");
        int n = scr.nextInt();

        System.out.println(fibo(n));
    }
}
