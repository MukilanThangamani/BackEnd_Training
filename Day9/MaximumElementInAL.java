package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElementInAL {
    public static void main(String[] args) {
        System.out.println("Enter size of List: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num = in.nextInt();
            list.add(num);
        }
        System.out.println("Maximum Element: "+Collections.max(list));
    }
}
