import java.util.Scanner;



public class Factorial {

    static int factorial(int n){
        int ans = 1;
        for (int i = 1;i<=n;i++){
            ans = ans * i;
        }
        return ans;
    }
    static int factorialRecursive(int n){
        if (n == 0 || n == 1){
            return  1;
        }
        return n * factorialRecursive(n-1);
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a no for factorial: ");
        int n = scr.nextInt();
        System.out.println("Factorial: "+factorialRecursive(n));
    }
}
