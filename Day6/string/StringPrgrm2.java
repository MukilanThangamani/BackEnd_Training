package string;

import java.util.Scanner;

public class StringPrgrm2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter string 1:");
        String s1 = in.nextLine();
        System.out.println("enter string 2:");
        String s2 = in.nextLine();
        int comp = s1.compareTo(s2);
        if(comp<0){
            System.out.println("s1 comes first");
        }
        else if(comp>0){
            System.out.println("s2 comes first");
        }
        else{
            System.out.println("They are equal");
        }
        boolean res = s1.equals(s2);
        if(res==true){
            System.out.println("case-Sensitive");
        }
        else{
            System.out.println("Not case -sensitive");
        }
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("case-Insensitive");
        }
        else{
            System.out.println("Not case sensitive");
        }
        String con = s1+s2;
        System.out.println("Concatenation of two strings:"+con);
    }
}
