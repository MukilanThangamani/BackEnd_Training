package Polymorphism;

public class Employee {
     int  sal;
     int month;

     public Employee(int sal,int month){
         this.sal = sal;
         this.month = month;
     }
    public void calculateSalary(){
        System.out.println("Sal:"+sal);
        System.out.println("month;"+month);
        System.out.println("worked:"+sal*month);
    }
}
class Manager extends Employee{
   int absent;
  public  Manager(int sal,int month,int abs){
       super(sal,month);
       this.absent = abs;
   }

    @Override
    public void calculateSalary() {
        System.out.println("sal:"+sal);
        System.out.println("mon:"+month);
        System.out.println("worked:"+sal*(month-absent));
    }
}
class Developer extends Employee{
    String role;

    public Developer(int sal, int month,String role) {
        super(sal, month);
        this.role = role;
    }
    @Override
    public void calculateSalary(){
        System.out.println("sal:"+sal);
        System.out.println("mon"+month);
        System.out.println("role:"+role);
        System.out.println("sal");
    }

    public static void main(String[] args) {
       Manager obj = new Manager(1000,12,3);
       obj.calculateSalary();
       Developer obj2 = new Developer(2000,12,"IOT");
       obj2.calculateSalary();
    }
}

