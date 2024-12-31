package Abstract;

abstract class Appliance {
    abstract void turnOn();
    public void turnOff(){
        System.out.println("turn off method");
    }
}
class Fan extends Appliance{
    public void turnOn(){
        System.out.println("Fan is running..");
    }

    public static void main(String[] args) {
        Fan obj = new Fan();
        obj.turnOff();
        obj.turnOn();
    }
}
