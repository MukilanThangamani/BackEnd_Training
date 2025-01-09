package Day9;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class ContactDirectoryManagementSystem {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Hashtable<String,Long> hash = new Hashtable<>();
        for(int i=0;i<n;i++){
            String str = in.next();
            long num = in.nextLong();
            hash.put(str,num);
        }
        System.out.println("Contact Directory:");
        for(Map.Entry<String,Long> entry : hash.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("search contact:");
        String s = in.next();
        Long number  = hash.get(s);
        System.out.println("search result for "+s+":"+number);
        String rem = in.next();
        System.out.println("Removed contact:"+hash.remove(rem));
        System.out.println("After removal :");
        for(Map.Entry<String,Long> entry : hash.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
