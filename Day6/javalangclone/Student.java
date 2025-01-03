package javalangclone;
public class Student implements Cloneable{
    String name;
    int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        try {
            Student obj = new Student("Hari", 23);
            Student obj2 = (Student) obj.clone();
            System.out.println("Name of student using clone : "+obj2.name);
            System.out.println("Age of student using clone : "+obj2.age);
        }
        catch (Exception e){}
    }
}
