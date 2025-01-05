package Reflection;

public class ReflectionExample {
    int rollNo;
    String name;
    int marks;
    public ReflectionExample(){
    }

    public ReflectionExample(int rollNo,String name,int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
        System.out.println(marks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void details(){
        System.out.println("Rollno:"+rollNo);
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);
    }
}
