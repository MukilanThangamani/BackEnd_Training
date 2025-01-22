package BiConsumer;

import java.util.function.BiConsumer;

public class Sum {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> cons = (n1,n2)-> System.out.println("Sum of "+n1+ " and "+ n2+" is "+(n1+n2));
        cons.accept(3,5);
    }
}
