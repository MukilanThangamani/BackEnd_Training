package InterfaceP1;

interface  Animal {
    void eat();
    void sleep();
}
class Dog implements Animal{
    public void eat(){
        System.out.println("Dog drinks milk");
    }
    public void sleep(){
        System.out.println("Dog sleep 12hrs per day");
    }
}
class Cat implements Animal{
    public void eat(){
        System.out.println("cat drinks milk");
    }
    public void sleep(){
        System.out.println("cat sleep everytime");
    }

    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.eat();
        obj.sleep();
        Animal obj2 = new Cat();
        obj2.eat();
        obj2.sleep();
    }
}