package callableFuture;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        CalculateFactorial cal = new CalculateFactorial(num);
        Future<Long> fact = executor.submit(cal);
        try{
            Long facts = fact.get();
            System.out.println("factorial is : "+facts);
        }catch (Exception e){}
        finally {
            executor.shutdown();
        }
    }
}
