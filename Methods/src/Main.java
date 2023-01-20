import java.util.Scanner;

class algebra{
    int add(int a,int b){
        int ans = a+ b;
        return ans;
    }
}

public class Main {

    public static void main(String[] args) {
        algebra obj = new algebra();
        Scanner scr = new Scanner(System.in);
        System.out.println("enter two no. for sum");
        int x = scr.nextInt();
        int y = scr.nextInt();
        int ans = obj.add(x,y);
        System.out.println(ans);
    }
}