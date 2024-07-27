package com.springbootdto.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "student")
@lombok.Data
public class Student {
    @Id
    @Column(name = "student_id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
    
    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Course> courses;
}
