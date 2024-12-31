package InheritanceP2;

public class Animal {
    public void sound(){
        System.out.println("Animal makes different sounds");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("dog bark");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("cat meow");
    }

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
        Cat obj2 = new Cat();
        obj2.sound();

    }
}
