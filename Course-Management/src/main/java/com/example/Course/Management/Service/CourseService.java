package com.example.Course.Management.Service;

import com.example.Course.Management.Model.Course;
import com.example.Course.Management.Model.CourseRegistered;
import com.example.Course.Management.Repository.CourseRegistryRepo;
import com.example.Course.Management.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {
    @Autowired
     CourseRepo courserepo;
    @Autowired
     CourseRegistryRepo courseRegistryRepo;
    public List<Course> availableCourse() {
      return courserepo.findAll();
    }

    public List<CourseRegistered> courseRegistered() {
        return courseRegistryRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistered courseRegistered = new CourseRegistered(name,emailId,courseName);
        courseRegistryRepo.save(courseRegistered);
    }
}
