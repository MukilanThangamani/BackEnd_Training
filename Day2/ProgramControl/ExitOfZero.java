package ProgramControl;

import java.util.Scanner;

public class ExitOfZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            int user = in.nextInt();
            if(user==0){
                break;
            }
        }
    }
}
