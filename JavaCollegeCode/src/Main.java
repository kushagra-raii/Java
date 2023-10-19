import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a no for factorial");
        int n = scr.nextInt();
        int ans = 1;
        for (int i = 1;i<=n;i++){
            ans = ans * i;
        }
        System.out.println(ans);
    }
}