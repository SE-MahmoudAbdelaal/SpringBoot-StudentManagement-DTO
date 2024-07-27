package com.springbootdto.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springbootdto.dto.StudentDTO;
import com.springbootdto.entity.Student;
import com.springbootdto.repo.StudentRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private StudentRepo studentRepo;
    public List<Student> getStudents() {
        return studentRepo.findAll();

    }
    public List<StudentDTO> getStudentsDTO() {
        List<Student> students = studentRepo.findAll();
        List<StudentDTO> studentsDTO = new ArrayList<>();
        //way 1
//        students.stream()
//                .forEach(student -> studentsDTO.add(modelMapper.map(student, StudentDTO.class)));
//        return studentsDTO;
        //way2
        return students.stream()
                .map(student -> modelMapper.map(student, StudentDTO.class))
                .collect(Collectors.toList());

    }

}
