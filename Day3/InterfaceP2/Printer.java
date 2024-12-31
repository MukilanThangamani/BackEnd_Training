package InterfaceP2;

interface Printer {
    void print();
 }
 interface Scanner{
    void scan();
 }
 class ALLInOne implements Printer,Scanner{

     @Override
     public void print() {
         System.out.println("print in printer");
     }

     @Override
     public void scan() {
         System.out.println("scan in scanner");
     }

     public static void main(String[] args) {
         ALLInOne obj = new ALLInOne();
         obj.print();
         obj.scan();
     }
 }

