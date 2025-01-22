package PredicateGrade;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
class Student {
    private String name;
    private int grade;

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class PassingGrades {
    public static void pass(List<Student> students, Predicate<Student> pred) {
        for (Student in : students) {
            if (pred.test(in)) {
                System.out.println(in.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 75));
        students.add(new Student("Alice", 55));
        students.add(new Student("Mark", 88));
        pass(students, (mark) -> mark.getGrade() > 60);
    }
}


