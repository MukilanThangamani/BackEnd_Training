package ArrayProblems;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] nums = new int[n1];
        for(int i=0;i<n1;i++){
            nums[i] = in.nextInt();
        }
    //    int[] nums = {3,0,1};
        int n = nums.length;
        int tot = 0;
        for(int  i : nums ){
            tot+=i;
        }
        System.out.println("Missing Element:"+(((n*(n+1))/2) - (tot)) );
    }
}
