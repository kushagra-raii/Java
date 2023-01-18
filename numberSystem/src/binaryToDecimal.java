import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int input = scr.nextInt();
        int  newNo,mul=1,decimal=0;
        while (input!=0) {
            newNo = input%2;
            input/=10;
            decimal+=(newNo*mul);
            mul*=2;
        }
        System.out.println(decimal);
    }
}
