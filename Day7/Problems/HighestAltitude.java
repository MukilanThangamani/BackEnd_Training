package Problems;

import java.util.Scanner;

public class HighestAltitude {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] gain = new int[n];
        for(int i=0;i<n;i++){
            gain[i] = in.nextInt();
        }
        int max=0;
        int curralt = 0;
        for(int i=0;i<n;i++){
            curralt+=gain[i];
            max = Math.max(max,curralt);
        }
        System.out.println("Highest Altitude: "+max);
    }
}
