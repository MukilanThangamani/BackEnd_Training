import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter num1");
        int n1 = in.nextInt();
        System.out.println("enter num2:");
        int n2 = in.nextInt();
        System.out.println("enter the operator:");
        char ch = in.next().charAt(0);
        int res;
        switch(ch){
            case '+':
                res = n1+n2;
                System.out.println(res);
                break;
            case '-':
                res = n1-n2;
                System.out.println(res);
                break;
            case '*':
                res = n1*n2;
                System.out.println(res);
                break;
            case '/':
                res = n1/n2;
                System.out.println(res);
                break;
            case '%':
                res = n1%n2;
                System.out.println(res);
                break;
        }
    }
}
