package OOPS;

public class Car {
    String brand;
    String model;
    int price;
    public void display(){
        System.out.println("brand of car:"+brand);
        System.out.println("model of car:"+model);
        System.out.println("price of car:"+price);
    }
    public int discount(){
        return 300%price;
    }
    public static void main(String[] args) {
      Car c1 = new Car();
      c1.brand = "BMW";
      c1.model = "superModel";
      c1.price = 2300000;
      c1.display();
        System.out.println(c1.discount());
    }
}
