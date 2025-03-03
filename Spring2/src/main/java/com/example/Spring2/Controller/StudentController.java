package com.example.Spring2.Controller;

import com.example.Spring2.Model.Student;
import com.example.Spring2.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return service.students();
    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @GetMapping("/student/{rno}")
    public Student studentByRno(@PathVariable int rno){
       return service.studentById(rno);
    }

    @PutMapping("/update")
    public String updateStudent(@RequestBody Student student){
        service.updateStudent(student);
        return "update success";
    }

    @DeleteMapping("delete/{rno}")
    public String deleteByRno(@PathVariable int rno){
        service.deleteByRno(rno);
        return "deleted  success";
    }


}
