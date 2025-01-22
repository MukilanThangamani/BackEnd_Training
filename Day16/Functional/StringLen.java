package Functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StringLen {

    public static void len(List<String> list ,Function<String,Integer> fun){
        List<Integer> numlist  = new ArrayList<>();
        for(String str : list){
            numlist.add(fun.apply(str));
        }
        System.out.println(numlist);
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        len(list,(str)->str.length());
    }
}
