package com.jpa.model;

import java.util.List;

import org.springframework.context.annotation.Profile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    // ...

    @OneToOne(mappedBy = "user")
    private Profile profile;
    // ...

    @OneToMany(mappedBy = "user")
   
    private List<Student> students;
    // ...
}

@Entity
@Table(name = "student")
 class Student1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String className;
    // ...

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(name = "student_teacher",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private List<Teacher> teachers;
    // ...
}
//A User has one Profile and many Student(one-to-one and one-to-many relationship)
//A Student has one User and many Teachers(many-to-one and many-to-many relationship)
//A join table "student_teacher" is created with foreign keys to both Student and Teacher tables.