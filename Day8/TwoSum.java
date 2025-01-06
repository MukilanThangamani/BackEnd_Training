package ArrayProblems;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static int[] sum(int[] nums,int target){
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return  null;
    }
    public static void main(String[] args) {
      //  int[] nums = {2,7,11,15};
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int target = 9;
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
        int[] res = sum(nums,target);
        System.out.println("Indices of two sum:"+Arrays.toString(res));
    }
}
