package Polymorphism;

public class Calculator {
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public double add(double a , double b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add(2,3);
        System.out.println(obj.add(1.23,2.42));
        System.out.println(obj.add(6,3,1));
    }
}
