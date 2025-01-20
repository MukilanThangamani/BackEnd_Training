package syns.Day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 class StudentLetter {
     String name;

     public StudentLetter(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }

 }
public class LetterFinding{
    public static void main(String[] args) {
        List<StudentLetter> students = new ArrayList<>(
                Arrays.asList(
                        new StudentLetter("abi"),
                        new StudentLetter("bala"),
                        new StudentLetter("aakash")
                )
        );
        String letter = "a";
        List<StudentLetter> starLetter = findletter(students,letter);
        System.out.println("student with first letter common :"+letter);
        starLetter.forEach(student-> System.out.println(student.getName()));
    }

    private static List<StudentLetter> findletter(List<StudentLetter> students, String letter) {
        return students.stream().filter(student->student.getName().toUpperCase().startsWith(letter.toUpperCase()))
                .collect(Collectors.toList());
    }
 }

