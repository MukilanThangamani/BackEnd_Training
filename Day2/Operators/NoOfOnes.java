package Operators;

import java.util.Scanner;

public class NoOfOnes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        while(n!=0){
            if(n%2!=0){
                count++;
            }
            n = n/2;
        }
        System.out.println(count);
    }
}
