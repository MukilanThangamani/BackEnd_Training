package day11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("entered size :"+n);
        String[] emailAdd = new String[n];
        for(int i=0;i<n;i++){
            emailAdd[i] = in.next();
        }
   //     System.out.print(Arrays.toString(emailAdd));
        String pattern = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.(com|org|net)$";
        Pattern patt = Pattern.compile(pattern);
        for(String email : emailAdd){
            Matcher matcher = patt.matcher(email);
            if(matcher.matches()){
                System.out.println(email+":"+"valid");
            }
            else{
                System.out.println(email+":"+"Invalid");
            }
        }
    }
}
