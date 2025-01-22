package PredicateLetter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StartsWithLetter {
    public static void starts(List<String> list, Predicate<String> pred){
        List<String> newlist = new ArrayList<>();
        for(String str : list){
            if(pred.test(str)){
                newlist.add(str);
            }
        }
        System.out.println(newlist);
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Avocado");
        list.add("Cherry");
        starts(list,(str)->str.charAt(0)=='A');
    }
}
