package JavaAcessmodifier.AcessModifierExample.AccessModifierDiff;

import JavaAcessmodifier.AcessModifierExample.Person;

public class TestAccess extends Person {
    void display(){
        System.out.println("Access in different package");
        System.out.println("Name of person: "+name);
        System.out.println("Age of person: "+age);
    }
    public static void main(String[] args) {
        TestAccess obj = new TestAccess();
        obj.display();
    }
}
