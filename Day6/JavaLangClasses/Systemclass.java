package JavaLangClasses;

import java.util.Scanner;
public class Systemclass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        long start = System.currentTimeMillis();
        for(int i=0;i<n;i++){
           if(i==2){
               break;
           }
        }
        long end = System.currentTimeMillis();
        System.out.println("Execution of loop : "+(end-start)+" MilliSeconds");
    }
}
