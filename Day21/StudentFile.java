package StudentManageSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class StudentFile implements Serializable {
    private final String filestored = "studentrecord.txt";

    public void saveFile(List<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filestored))) {
            for (Student student : students) {
                writer.write(student.getId() + "," + student.getName() + "," +
                        student.getAge() + "," + student.getGrade() + "," +
                        student.getEmail());
                writer.newLine();
            }
            System.out.println("Students saved to file.");
        } catch (IOException e) {
            System.err.println("Error saving students: " + e.getMessage());
        }
    }

    public List<Student> loadFile() {
        List<Student> students = new ArrayList<>();
        try  {
            BufferedReader reader = new BufferedReader(new FileReader(filestored)) ;
            String data;
            while ((data = reader.readLine()) != null) {
                String[] size = data.split(",");
                if (size.length == 5) {
                    int id = Integer.parseInt(size[0]);
                     String name = size[1];
                     int age = Integer.parseInt(size[2]);
                     char grade = size[3].charAt(0);
                     String email = size[4];

                    students.add(new Student(id, name, age, grade, email));
                }
            }
            System.out.println("Students loaded from file ");
        } catch (IOException e) {
        } catch (NumberFormatException e) {
        }
        return students;
    }
}





