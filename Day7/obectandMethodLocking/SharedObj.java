package obectandMethodLocking;


public class SharedObj {
    Object obj1 = new Object();
    Object obj2 = new Object();
    int c=0;
    public void met1(String str){
        synchronized (obj1){
            for(int i=1;i<=2;i++){
                System.out.println(str);
                try{Thread.sleep(1);}catch (InterruptedException e){}
            }
        }
    }
    public void met2(int n){
        synchronized (obj2){
            for(int i=1;i<=n;i++){
                c++;
                try{Thread.sleep(1);}catch (InterruptedException e){}
            }
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
            public void run() {
                thread();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long end = System.currentTimeMillis();
        System.out.println("sync object:"+(end-st));
    }
}

