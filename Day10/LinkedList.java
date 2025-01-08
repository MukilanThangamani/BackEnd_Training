import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class LinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int n  = in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++){
            String str =  in.nextLine();
            list.add(str);
        }
        String s1 = in.nextLine();
        list.remove(s1);
       // System.out.println(list);
        Iterator<String> itr = list.iterator();
        int i=0;
        while (itr.hasNext()){
            i++;
            System.out.println(i+"."+itr.next());
        }
    }
}
