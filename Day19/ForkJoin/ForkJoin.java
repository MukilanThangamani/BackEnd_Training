package ForkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

public class ForkJoin{
    public static void main(String[] args) {
        ForkJoinPool fork = new ForkJoinPool();
        Add add = new Add(1,1000000);
        long res = fork.invoke(add);
        System.out.println("sum:"+res);
    }
}