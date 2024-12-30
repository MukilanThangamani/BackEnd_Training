package ThisMethodOverloading;

public class Employee {
    int id;
    String name;
    int salary;
    public Employee(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
    }
    public void Employee(int id,String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("Using this keyword: ");
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.Employee(102,"Haresh",25000);

    }
}
