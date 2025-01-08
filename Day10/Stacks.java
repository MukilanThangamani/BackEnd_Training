import java.util.Scanner;
import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Stack<String> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            String str = in.nextLine();
            st.add(str);
        }
        int le = in.nextInt();
        System.out.println("Curent Text:"+st.get(le));
    }
}