package Day18.AnalysingPerformanceOfStud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
     String name;
     String dept;
      List<Integer> marks;
     char  grade;
     double average;

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public char getGrade() {
        return grade;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return name;
    }


    public Student(String name, String dept, List<Integer> marks) {
        this.name = name;
        this.dept = dept;
        this.marks = marks;
        this.average = marks.stream().
                mapToDouble(Integer::intValue).
                average().orElse(0.0);
    }

    public char gradeForStudent(Double average){
        if(average>=90){
            return 'A';
        }
        else if(average>=80 && average<=89){
            return 'B';
        }
        else if(average>=70 && average<=79){
            return 'C';
        }
        else if(average>=59 && average<=69){
            return 'D';
        }
        else {
            return 'F';
        }
    }
}
