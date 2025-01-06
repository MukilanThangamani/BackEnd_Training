package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] nums = new int[n1];
        for(int i=0;i<n1;i++){
            nums[i] = in.nextInt();
        }



     //   int[] nums = {1,2,3,4,5,6,7};
        int k = 3; //5 6 7 1 2 3 4
        int n = nums.length;
        int[] temp = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = nums[n-k+i];
        }
        for(int i=n-1;i>=k;i--){
            nums[i] = nums[i-k];
        }
        for(int i=0;i<k;i++){
            nums[i]=temp[i];
        }

        System.out.println(Arrays.toString(nums));
    }
}
