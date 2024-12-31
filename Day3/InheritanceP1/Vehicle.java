package InheritanceP1;

public class Vehicle {
    public void start(){
        System.out.println("This is vehicle class starts");
    }
}
class Car extends  Vehicle{
    @Override
    public void start(){
        System.out.println("This is updated in car vehicle");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
