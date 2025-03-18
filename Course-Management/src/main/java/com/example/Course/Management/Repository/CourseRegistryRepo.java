package com.example.Course.Management.Repository;

import com.example.Course.Management.Model.CourseRegistered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistered,Integer> {
}
