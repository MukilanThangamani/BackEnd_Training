package Problems;
import java.util.Scanner;
public class MinChips {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] position = new int[n];
        for(int i=0;i<n;i++){
            position[i] = in.nextInt();
        }
        int e=0,o=0;
        for(int i : position){
            if(i%2==1){
                o++;
            }
            else{
                e++;
            }
        }
        System.out.println("Minimum chips: "+Math.min(o,e));
    }
}
