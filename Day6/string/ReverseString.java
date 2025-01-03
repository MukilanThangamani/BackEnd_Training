package string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("Sentence Before reverse"+str);
        String[] s = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=s.length-1;i>=0;i--){
            String s1 = s[i];
            for(int j=s1.length()-1;j>=0;j--){
                sb.append(s1.charAt(j));
            }
            sb.append(" ");
        }
        System.out.println("Reversed Sentence:"+sb);
    }
}
