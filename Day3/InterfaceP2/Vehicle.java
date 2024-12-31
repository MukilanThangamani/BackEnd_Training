package InterfaceP2;

interface Vehicle {
    void start();
}
interface FourWheeler extends Vehicle {
   void start();
   void drive();
}
interface TwoWheeler extends  Vehicle{
     void start();
     void ride();
}
class Bus implements FourWheeler{
   public  void start(){
       System.out.println("let's start the bus");
    }
   public void drive(){
       System.out.println("Safe drive");
    }
}
class Cycle implements TwoWheeler{
    public  void start(){
        System.out.println("let's do cycling");
    }
    public void ride(){
        System.out.println("Safe pedal riding");
    }

    public static void main(String[] args) {
        Bus obj = new Bus();
        obj.start();
        obj.drive();
        Cycle obj2 = new Cycle();
        obj2.start();
        obj2.ride();
    }
}
