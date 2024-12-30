package OOPS;

public class Dog extends Animal {
    public void speak(){
        System.out.println("Dog makes Bow Bow");
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();
        Dog dg = new Dog();
        dg.speak();

    }
}
