package StudentManageSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentInfo extends  Thread{
    public static void main(String[] args) throws InterruptedException {
        StudentController manager = new StudentController();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("***** Student Management System *****");
            System.out.println("1. Add students");
            System.out.println("2. View students");
            System.out.println("3. Search students");
            System.out.println("4. Update students");
            System.out.println("5. Delete students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter student id: ");
                        int id = in.nextInt();
                        in.nextLine();

                        System.out.print("Enter name of the student: ");
                        String name = in.nextLine();

                        System.out.print("Enter age for student: ");
                        int age = in.nextInt();
                        in.nextLine();

                        System.out.print("Enter grade for student: ");
                        char grade = in.next().charAt(0);
                        in.nextLine();

                        System.out.print("Enter student email id: ");
                        String email = in.nextLine();

                        manager.addStudent(id, name, age, grade, email);
                        Thread.sleep(150);
                    } catch (InputMismatchException e) {
                        System.out.println("invalid input ");
                        in.nextLine();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case 2:
                    manager.viewStudentsById();
                    Thread.sleep(150);
                    break;

                case 3:
                    System.out.print("Enter the id to search student: ");
                    int id = in.nextInt();
                    manager.searchStudentById(id);
                    Thread.sleep(150);
                    break;

                case 4:
                    System.out.print("Enter the id to update the student: ");
                    int idUpdate = in.nextInt();
                    manager.updateStudentById(idUpdate);
                    Thread.sleep(150);
                    break;

                case 5:
                    System.out.print("Enter the id to delete  student: ");
                    int delete = in.nextInt();
                    manager.deleteStudentById(delete);
                    Thread.sleep(150);
                    break;

                case 6:
                    System.out.println("Exit");
                    System.out.println("Completion of student management system");
                    Thread.sleep(150);
                    return;

                default:
                    Thread.sleep(150);
                    System.out.println("Invalid input");
            }
        }
    }
}
