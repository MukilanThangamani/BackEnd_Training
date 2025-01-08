import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        in.nextLine();
        Queue<String> qu = new LinkedList<>();
        for(int i=0;i<n;i++) {
            String s1 = in.nextLine();
            qu.add(s1);
        }
        in.nextLine();
        String s1 = in.nextLine();
        qu.offer(s1);
        System.out.println(qu);
    }
}
