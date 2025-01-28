package Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExecutorsAndVisualVM {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i=1;i<=10;i++){
            executor.submit(new Task(i));
        }
        executor.shutdown();
    }
}