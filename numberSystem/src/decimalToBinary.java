import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int input = scr.nextInt(),newNo,mul=1,sum=0;
        while (input!=0) {
            newNo = input%2;
            input = input/2;
            sum = sum + (newNo*mul);
            mul*=10;
        }
        System.out.println(sum);
    }
}
