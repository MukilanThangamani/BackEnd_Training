import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Set {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("entered size:"+n);
        HashSet<String> set = new HashSet<>();
        in.nextLine();
        for(int i=0;i<n;i++){
            String str = in.nextLine();
            set.add(str);
        }
        System.out.println("Unique names:"+set);
    }
}
