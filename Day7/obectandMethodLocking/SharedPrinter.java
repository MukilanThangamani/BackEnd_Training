package obectandMethodLocking;

public class SharedPrinter {
    int c=0;
    synchronized public void met1(String str){
        for(int i=0;i<=2;i++){
            System.out.println(str);
            try{Thread.sleep(1);}catch (InterruptedException e){}
        }
    }
    synchronized public void met2(int n){
        for(int i=1;i<=n;i++){
            c++;
            try{Thread.sleep(1);}catch (InterruptedException e){}
        }
    }

    public void thread(){
        met1("hello");
        met2(3);
    }

    public void sync() throws  InterruptedException{
        long st = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                thread();

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                thread();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long end = System.currentTimeMillis();
        System.out.println("sync method:"+(end-st));
    }
}
