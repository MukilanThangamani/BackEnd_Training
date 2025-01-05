package Problems;

import java.util.Scanner;

public class MaximumKrepvalue {
    public static int maxrep(String sequence,String word){
        int c=0;
        if(sequence.contains(word)){
            c++;
            String con = word+word;
            if(sequence.contains(con)){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sequence  = in.nextLine();
        String word = in.nextLine();
        System.out.println("entered sequence string : "+sequence);
        System.out.println("entered word string : "+word);
        System.out.println("Maximum k-rep values : "+maxrep(sequence,word));
    }
}
