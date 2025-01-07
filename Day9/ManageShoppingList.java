package Day9;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageShoppingList {
    public static void main(String[] args) {
        System.out.println("Enter size of List: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String str = in.next();
            list.add(str);
        }
        int rem = in.nextInt();
        list.remove(rem);
        System.out.println("Shopping List: "+list);

    }
}
