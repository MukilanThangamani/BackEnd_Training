package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class NextGreaterElement {
    public static int[] nextgreater(int[] nums){
        int[] arr = new int[nums.length];
        Arrays.fill(arr,-1);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    arr[i] = nums[j];
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
       // int[] nums = {4,5,2,10};
        int[] res = nextgreater(nums);
        System.out.println("Next Greater Element:"+Arrays.toString(res));
    }
}
