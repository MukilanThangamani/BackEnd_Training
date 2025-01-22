package UnaryOper;

import java.util.function.UnaryOperator;

public class Unary {
    public static void main(String[] args) {
        UnaryOperator<String> unary =  str ->  str.toUpperCase();
        System.out.println("UpperCase of String:"+unary.apply("hello"));
    }
}
