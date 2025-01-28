package Executor;

public class Task implements Runnable{
    private final int id;
    public Task(int id){
        this.id = id;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("task"+id+"-number"+i);
        }
    }
}
