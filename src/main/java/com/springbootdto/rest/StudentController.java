package com.springbootdto.rest;

import com.springbootdto.dto.StudentDTO;
import com.springbootdto.entity.Student;
import com.springbootdto.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    @GetMapping("/dto")
    public List<StudentDTO> getStudentsDTO() {
        return studentService.getStudentsDTO();
    }
}
