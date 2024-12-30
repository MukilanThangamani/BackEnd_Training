package Operators;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte n1 = in.nextByte();
        byte n2 = in.nextByte();
        byte n3 = in.nextByte();
        byte res = (n1>n2 && n1>n3) ? n1 : (n2>n1 && n2>n3) ? n2 : n3;
        System.out.println(res);
     }
}
