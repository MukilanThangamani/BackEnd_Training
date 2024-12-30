import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int lefts = n1<<2;
        int rights = n1>>2;
        System.out.println("left shift:"+lefts);
        System.out.println("right shift:"+rights);
        int xor = 2^2;
        int xor1 = 2^3;
        System.out.println(xor);
        System.out.println(xor1);
    }
}
