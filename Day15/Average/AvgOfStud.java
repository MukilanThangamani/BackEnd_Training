package syns.Day15.Average;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AvgOfStudents {
    String name;
    double gpa;

    public double getGpa() {
        return gpa;
    }


    public AvgOfStudents(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
}
class AvgOfStud {
    public static void main(String[] args) {
        List<AvgOfStudents> students = new ArrayList<>(
                Arrays.asList(
                        new AvgOfStudents("abi",7.6),
                        new AvgOfStudents("guna",8.4),
                        new AvgOfStudents("mani",7.5)
                )
        );
        double averggpa = calc(students);
        System.out.println("avgOfGpa:"+averggpa);

    }

    private static double calc(List<AvgOfStudents> students) {
        return students.stream().mapToDouble(AvgOfStudents::getGpa).average().orElse(0.0);
    }
}

