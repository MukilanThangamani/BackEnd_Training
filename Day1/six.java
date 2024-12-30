import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String res = (num%2==0)?"Even":"Odd";
        System.out.println(res);
    }
}
