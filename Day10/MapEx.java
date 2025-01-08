import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class MapEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        int n = in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++){
            String str = in.nextLine();
            int n1 = in.nextInt();
            in.nextLine();
            if(map.containsKey(str)){
                int n2 = in.nextInt();
                map.put(str,n2);
            }
            map.put(str,n1);
        }
        int num = in.nextInt();
        System.out.println(map.get(num));
        System.out.println("Alice grade:"+map.get("alice"));
        System.out.println("All students and grades:");
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
