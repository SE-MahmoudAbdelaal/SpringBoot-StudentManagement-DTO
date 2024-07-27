package com.springbootdto.service;

import com.springbootdto.entity.Course;
import com.springbootdto.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

}
