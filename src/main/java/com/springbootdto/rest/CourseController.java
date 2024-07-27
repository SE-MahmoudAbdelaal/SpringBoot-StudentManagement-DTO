package com.springbootdto.rest;

import com.springbootdto.entity.Course;
import com.springbootdto.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}
