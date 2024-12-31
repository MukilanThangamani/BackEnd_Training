package InheritanceP1;

public class Person {
    String name;
    int age;
    public void personDetais(){
        System.out.println("person name:"+name);
        System.out.println("age of person:"+age);
    }
}
class Student extends Person{
   int rollNumber;
   int marks;
   public void studentDetails(){
       personDetais();
       System.out.println("Stud rollno:"+rollNumber);
       System.out.println("stud mark:"+marks);
   }
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Akil";
        st.age = 34;
        st.rollNumber = 7;
        st.marks=78;
        st.studentDetails();
    }
}
