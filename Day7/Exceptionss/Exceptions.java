package Exceptionss;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            int n1 =in.nextInt();
            int n2 = in.nextInt();
            int res = n1/n2;
            System.out.println("res of division:"+res);
            int[] arr = null;
            System.out.println(arr.length);
        }
        catch (ArithmeticException e){
            System.out.println("Error:Division by Zero is not allowed");
        }
        catch (InputMismatchException e){
            System.out.println("Error : Please enter valid integers");
        }
        catch (Exception e){
            System.out.println("An unexpected error occurred");
        }
    }
}

