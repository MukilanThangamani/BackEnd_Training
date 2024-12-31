package Static;
import java.util.Scanner;

public class Utility{
    public static String convertToUpper(String str){
        return str.toUpperCase();
    }
    public static void main(String[] args) {
        Utility obj = new Utility();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(obj.convertToUpper(str));
    }
}