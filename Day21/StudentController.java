import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StudentController {
    private List<Student> students;
    private StudentFile file;

    public StudentController() {
        file = new StudentFile();
        students = file.loadFile();
    }

    public void addStudent(int id, String name, int age, char grade, String email) {
        String reg = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(reg);
        Matcher match = pattern.matcher(email);

        if (!match.matches()) {
            System.out.println("email is not in a correct format");
            return;
        }

        students.add(new Student(id, name, age, grade, email));
        System.out.println("Student record added ");
        file.saveFile(students);
    }

    public void viewStudentsById() {
        if (students.isEmpty()) {
            System.out.println("student not found ");
            return;
        }

        System.out.println("student record in list ");
        students.forEach(System.out::println);
    }

    public void searchStudentById(int id) {
        Optional<Student> student = students.stream()
                .filter(s -> s.getId() == id)
                .findFirst();

        if (student.isPresent()) {
            System.out.println("Student details: " + student.get());
        } else {
            System.out.println("Student with id " + id + " not in list");
        }
    }

    public void updateStudentById(int id) {
        Optional<Student> stud = students.stream()
                .filter(s -> s.getId() == id)
                .findFirst();

        if (stud.isPresent()) {
            Student student = stud.get();
            Scanner scanner = new Scanner(System.in);

            System.out.println("update  student with id: " + id);

            System.out.print("which attribute you want to update in record ");
            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "name":
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    if (!newName.isEmpty()) student.setName(newName);
                    break;

                case "age":
                    System.out.print("Enter new age: ");
                    String newAge = scanner.nextLine();
                    if (!newAge.isEmpty()) {
                        try {
                            student.setAge(Integer.parseInt(newAge));
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid age format.");
                        }
                    }
                    break;

                case "grade":
                    System.out.print("Enter new grade: ");
                    String newGrade = scanner.nextLine();
                    if (!newGrade.isEmpty()) student.setGrade(newGrade.charAt(0));
                    break;

                case "email":
                    System.out.print("Enter new email: ");
                    String email = scanner.nextLine();
                    if (!email.isEmpty() && isValid(email)) {
                        student.setEmail(email);
                    } else {
                        System.out.println("Invalid email format.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. No updates made.");
                    return;
            }
            file.saveFile(students);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    private boolean isValid(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }



    public void deleteStudentById(int id) {
        boolean remove = students.removeIf(s -> s.getId() == id);

        if (remove) {
            System.out.println("student with id " + id + " is deleted ");
            file.saveFile(students);
        } else {
            System.out.println("student with id " + id + "is  not in record");
        }
    }
}


