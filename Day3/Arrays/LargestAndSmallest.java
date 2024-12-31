package Arrays;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void larandsmall(int[] arr) {
        int small = arr[0];
        int lar = arr[0];
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small = arr[i];
            }
            if(lar<arr[i]){
                lar = arr[i];
            }
        }
        System.out.println("Largest Number:"+lar);
        System.out.println("SmallestNumber:"+small);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of arr:");
        int n = in.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        larandsmall(arr);
    }
}


