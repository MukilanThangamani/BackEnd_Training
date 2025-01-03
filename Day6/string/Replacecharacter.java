package string;

import java.util.Scanner;

public class Replacecharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "Mukilan";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if((c=='a' || c=='A') || (c=='e'||c=='E')|| (c=='i' || c=='I')||(c=='o'||c=='O') ||(c=='u'||c=='U')){
                sb.append("*");
            }
            else{
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
