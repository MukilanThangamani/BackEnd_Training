package obectandMethodLocking;

public class SharedPrinterStatic {
    static int c = 0;
    synchronized public static void met1(String str) {
        for (int i = 0; i <= 2; i++) {
            System.out.println(str);
        }
    }
    synchronized public static void met2(int n) {
        for (int i = 1; i <= n; i++) {
            c++;
        }
    }
    public static void thread() {
        met1("hello");
        met2(3);
    }
    public static void sync() throws InterruptedException {
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
        System.out.println("sync static method: " + (end - st));
    }
}
