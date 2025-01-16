package Palindrome;

public class Palindrome {
    public boolean strpalin(String str){
        int l = str.toLowerCase().charAt(0);
        int r = str.toLowerCase().charAt(str.length()-1);
        while(l<r){
            if(str.charAt(l) !=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}
