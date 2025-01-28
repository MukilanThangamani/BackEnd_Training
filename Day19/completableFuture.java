import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
public class completableFuture {
    public static void main(String[] args) {
        CompletableFuture<String>  complete = CompletableFuture.supplyAsync(()->{
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
            return "user data";
        });

        CompletableFuture<String>  complete1 = CompletableFuture.supplyAsync(()->{
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
            return "user order";
        });

        CompletableFuture<String> combine = complete.thenCombine(complete1,(userData,userOrders)->{
            return userData +" "+userOrders;
        });

        try{
            String res = combine.get();
            System.out.println(res);
        }catch(InterruptedException | ExecutionException e){}

    }
}
