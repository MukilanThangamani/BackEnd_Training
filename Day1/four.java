import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int n1 = in.nextInt();
         int n2 = in.nextInt();
         if(n1>n2){
             System.out.println("n1 is greater");
         }
         else if (n1==n2) {
             System.out.println("they are equal");
         }
         else if(n1!=n2) {
             System.out.println("they are not equal");
         }
         else if (n1>=n2) {
             System.out.println("n1 is greater than n2");
         }
         else if(n1<=n2){
             System.out.println("n2 is smaller than n2");
         }
    }
}
