package com.example.Spring2.Service;

import com.example.Spring2.Model.Student;
import com.example.Spring2.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo repo;
    public List<Student> students() {
        return repo.findAll();
    }

    public Student addStudent(Student student) {
         return repo.save(student);
    }

    public Student studentById(int rno) {
      return repo.findById(rno).orElse(new Student());
    }

     public void updateStudent(Student student) {
        repo.save(student);
    }

    public void deleteByRno(int rno) {
        repo.deleteById(rno);
    }
}
