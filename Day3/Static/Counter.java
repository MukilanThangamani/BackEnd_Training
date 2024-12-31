package Static;

public class Counter {
    static int c;
    public Counter(){
        c++;
    }
    public static void count(){
        System.out.println(c);
    }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter.count();
    }
}
