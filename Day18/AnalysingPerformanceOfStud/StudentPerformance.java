package Day18.AnalysingPerformanceOfStud;


import java.util.*;
import java.util.stream.Collectors;

public class StudentPerformance {
    public static void main(String[] args) {
        List<Student> students =
                Arrays.asList(
                        new Student("John","ECE",Arrays.asList(75,86,42,68,52)),
                        new Student("Abi","CSBS",Arrays.asList(63,68,94,78,51)),
                        new Student("Elango","AIML",Arrays.asList(82,78,69,79,85)),
                        new Student("Naveen","ECE",Arrays.asList(86,42,78,59,74)),
                        new Student("Kiran","CSBS",Arrays.asList(45, 30, 35, 30, 35)),
                        new Student("praveen","AIML",Arrays.asList(53,62,69,84,79))
                        );

        List<Student> toppers = students.stream()
                .sorted(Comparator.comparingDouble(Student::getAverage).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Overall top students :"+toppers);

        System.out.println(" ");
        Map<String, Double> deptAverages = students.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.averagingDouble(Student::getAverage)));
                 System.out.println(" Average for each department :");

        deptAverages.forEach((dept, avg)->System.out.println(dept + ": " + avg));

        System.out.println(" ");

        Map<String, Optional<Student>> topStudentInEachDept = students.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.maxBy(Comparator.comparingDouble(Student::getAverage))));
        System.out.println("Topstudent in each department :");

        topStudentInEachDept.forEach((dept,student)->System.out.println(dept + ": " + student.orElse(null).name));

        System.out.println(" ");
        Long failedStudents = students.stream()
                .filter(student->student.getAverage() < 50)
                .collect(Collectors.counting());
        System.out.println("Failed students by their average : " + failedStudents);
    }
}
