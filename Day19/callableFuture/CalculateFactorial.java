package callableFuture;

import java.util.concurrent.Callable;

public class CalculateFactorial implements Callable<Long> {
    private int num;
    public CalculateFactorial(int num){
        this.num = num;
    }
    public Long call() throws Exception{
        long fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
}
