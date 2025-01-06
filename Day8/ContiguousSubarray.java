package ArrayProblems;

import java.util.Scanner;

public class ContiguousSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
    //    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max=0;
        int sum=0;
        for(int i=0;i< nums.length;i++){
            sum+=nums[i];
            if(sum<0){
                sum = 0;
            }
            max = Math.max(max,sum);
        }
        System.out.println("Largest sum: "+max);
    }
}
