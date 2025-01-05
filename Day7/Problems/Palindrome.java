package Problems;

import java.util.Scanner;

public class Palindrome {
    public static boolean check(String s){
        int l=0;
        int r = s.length()-1;
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
                return isPalin(s,l+1,r) || isPalin(s,l,r-1);
            }
        }
        return true;
    }
    public static boolean isPalin(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }

            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("enter string is : "+s);
        System.out.println(check(s));
    }
}
