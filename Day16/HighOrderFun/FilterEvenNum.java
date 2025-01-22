package HighOrderFun;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterEvenNum {
    public static void even(List<Integer> list, Predicate<Integer> pred){
        List<Integer> evenlist = new ArrayList<>();
        for(Integer in : list){
            if(pred.test(in)){
                evenlist.add(in);
            }
        }
        System.out.println(evenlist);
    }
    public static void main(String[] args) {
        FilterEvenNum filter = new FilterEvenNum();
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(45);
        list.add(22);
        list.add(35);
        list.add(60);
        even(list,(num)->num%2==0);
    }
}