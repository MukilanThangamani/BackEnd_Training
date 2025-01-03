package string;

import java.util.Scanner;



public class StringPrgrm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if((c=='a' || c=='A') || (c=='e'||c=='E')|| (c=='i' || c=='I')||(c=='o'||c=='O') ||(c=='u'||c=='U')){
              count++;
            }
        }
        System.out.println("NO of Vowels :" +count);





    }

}
