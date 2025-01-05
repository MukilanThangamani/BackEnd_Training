package obectandMethodLocking;
public class MethodandObj {
    public static void main(String[] args) throws InterruptedException {
        SharedObj object = new SharedObj();
        object.sync();
        System.out.println("methods:");
        SharedPrinter share = new SharedPrinter();
        share.sync();
        System.out.println("static methods:");
        SharedPrinterStatic.sync();
    }
}

