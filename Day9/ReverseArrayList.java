package Day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayList {
    public static void main(String[] args) {
        System.out.println("Enter the size of list : ");
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int n1 = in.nextInt();
            list.add(n1);
        }
     //   System.out.println(list);
        ArrayList<Integer> listrev = new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            int rev = list.get(i);
            listrev.add(rev);
        }
        System.out.println("Reversed List: "+listrev+" ");
    }
}
