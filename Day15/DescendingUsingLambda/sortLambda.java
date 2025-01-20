package syns.Day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortLambda {
    public sortLambda() {
        List<Student> list = new ArrayList<>();
        Student st1 = new Student(7.5);
        Student st2 = new Student(7.9);
        Student st3 = new Student(8.0);
        Student st4 = new Student(8.1);
        Student st5 = new Student(8.5);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        Collections.sort(list,(Student1,Student2)->Double.compare(Student2.getGPA(),Student1.getGPA()));
        System.out.println(list);

    }

    public static void main(String[] args) {
        sortLambda sort = new sortLambda();
    }
}
