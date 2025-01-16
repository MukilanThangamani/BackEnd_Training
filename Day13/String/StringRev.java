package String;

public class StringRev {
     public String reverse(String str){
         if(str==null){
             return "null";
         }
         if(str.length()==1){
             StringBuilder s = new StringBuilder(str);
             return s.reverse().toString();
         }
         StringBuilder sb = new StringBuilder();
         for(int i=str.length()-1;i>=0;i--){
             char ch = str.charAt(i);
             sb.append(ch);
         }
         return sb.toString();
     }
}
