# Student Management System

This project is a simple console-based Student Management System written in Java. It allows users to manage student records efficiently.

## Features

- **Add Student**: Register new students.
- **View Students**: Display information of all registered students.
- **Search Student**: Search for students by ID.
- **Update Student**: Update student details.
- **Delete Student**: Delete student records.
- **Store and Retrieve Records**: Save and load student records from a file.

## Installation

1. **Clone the repository:**

git clone https://github.com/yourusername/student-management-system.git

2. Navigate to the project directory
cd student-management-system

3.Compile the java files
javac Student.java StudentManager.java StudentInfo.java

4.Run the application
java StudentInfo



======================= *** WELCOME TO STUDENT MANAGEMENT SYSTEM *** =======================

=============================== *** ENTER YOUR CHOICE *** ===============================

1].ADD STUDENT                  2].VIEW STUDENTS
3].SEARCH STUDENT               4].UPDATE STUDENT
5].DELETE STUDENT               6].Exit
=============================== *** EXIT *** ===============================




1.Adding a Student
Select 1 to add a new student.

Enter the student's ID, name, age, grade, and email .
---------------------------------------------------------------------------------------------------------------

2.Viewing Students
Select 2 to view all registered students.

The details of all students will be displayed.
---------------------------------------------------------------------------------------------------------------

3.Searching a Student
Select 3 to search for a student by ID.

Enter the student's ID .

The details of the student will be displayed if found.
---------------------------------------------------------------------------------------------------------------

4.Updating a Student
Select 4 to update a student's details.

Enter the student's ID and the new details .
---------------------------------------------------------------------------------------------------------------

5.Deleting a Student
Select 5 to delete a student by ID.

Enter the student's ID .
---------------------------------------------------------------------------------------------------------------
6.Exit
Select 6 to Exit.

**CLASSES
Student: Represents a student with attributes like ID, name, age, grade, and email.

StudentManager: Manages the list of students and provides methods to add, view, search, update, and delete students.

StudentInfo: Handles the user interface and interactions, using the StudentManager class to manage student records.


