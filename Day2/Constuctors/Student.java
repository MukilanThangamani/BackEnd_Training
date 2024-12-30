package Constuctors;

public class Student {
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displays(){
        System.out.println("Student name:"+name);
        System.out.println("Age of student:"+age);
    }
    public static void main(String[] args) {
        Student st = new Student("Hari",19);
        st.displays();
    }
}
