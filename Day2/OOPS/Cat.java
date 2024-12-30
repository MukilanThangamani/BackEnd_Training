package OOPS;

public class Cat extends Animal {
    public void speak(){
        System.out.println("Cat makes meow meow");
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();
        System.out.println("override from super class");
        Dog dg = new Dog();
        dg.speak();
        Cat c = new Cat();
        c.speak();
    }
}
