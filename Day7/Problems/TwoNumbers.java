package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class TwoNumbers {
    public static int[] sum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length;j++){
               if(arr[i]+arr[j]==target){
                   return new int[]{i,j};
               }
           }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        int[] res = sum(arr,target);
        System.out.println("Indicies of two num: "+Arrays.toString(res));
    }
}
