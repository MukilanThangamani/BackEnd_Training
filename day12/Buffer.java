package day12;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Scanner;

public class Buffer {
    public static void main(String[] args) {
        CharBuffer buff = CharBuffer.allocate(8);
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            buff.put(ch);
        }
        int pos = buff.position();
        System.out.println("before flip posi:"+pos);
        buff.flip();
        int pos1 = buff.position();
        System.out.println("after flip position:"+pos1);
        System.out.println("Limit :"+buff.limit());

        ByteBuffer bytes = ByteBuffer.allocate(5);
        for(int i=0;i<bytes.limit();i++){
            int n1 = in.nextInt();
            bytes.put((byte) n1);
        }
        System.out.println("only limit of:"+bytes.limit());
        System.out.println("position :"+bytes.position());
        System.out.println();
    }
}
