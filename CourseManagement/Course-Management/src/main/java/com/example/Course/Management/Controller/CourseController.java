package com.example.Course.Management.Controller;

import com.example.Course.Management.Model.Course;
import com.example.Course.Management.Model.CourseRegistered;
import com.example.Course.Management.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {
    @Autowired
    CourseService service;

    @GetMapping("/courses")
    public List<Course> availableCourses(){
       return service.availableCourse();
    }

    @GetMapping("/course/registered")
    public List<CourseRegistered> courseRegistered(){
        return service.courseRegistered();
    }

    @PostMapping("/course/register")
    public String enroll(@RequestParam("name") String name,@RequestParam("emailId") String emailId,@RequestParam("courseName") String courseName){
        service.enrollCourse(name,emailId,courseName);
        return "congrats "+name+" you've enrolled for"+courseName+" course successfully";
    }
}
