import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram {
    static void printArr(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    static int minimum(int[] arr){
        int min = arr[0];
        for (int i = 1;i< arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static void takeArr(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i< arr.length;i++){
            System.out.print("Enter a no. for array: ");
            arr[i] = sc.nextInt();

        }
    }

    public static void main(String[] args) {
        int[] a = new int[5];
//        takeArr(a);
//        printArr(a);

        int[] b = {55,4,87,75,45};
        System.out.println(minimum(b));


    }
}
