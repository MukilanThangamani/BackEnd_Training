package JavaAcessmodifier.AcessModifierExample;

public class Employee extends  Person{
    void disp(){
        System.out.println("Name of person: "+name);
        System.out.println("Age of the person: "+age);
        System.out.println("Address of the person: "+address);
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.disp();
    }
}
