package Arrays;

import java.util.Scanner;

public class SumOfEle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = in.nextInt();
        System.out.println("enter the elements:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of all elements:"+sum);
    }
}
