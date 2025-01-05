package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class NoOfStrings {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
       String word = "abc";
        int c=0;
        for(int i=0;i<patterns.length;i++){
            String s1 = patterns[i];
            if(word.contains(s1)){
                c++;
            }
        }
        System.out.println("Number of substrings :"+c);
    }
}
