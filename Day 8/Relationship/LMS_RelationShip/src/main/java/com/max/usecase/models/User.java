package com.max.usecase.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
// @Table(name = "lms_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;
    private String name;
    private String email;
    private String password;
    private String role;
    @OneToMany(mappedBy = "user")
    private List<Enrollment> enrollments;

    @OneToMany(mappedBy = "user")
    private List<Course> createdCourses;

    @OneToMany(mappedBy = "user")
    private List<JwtToken> jwtTokens;

    public Long getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public List<Course> getCreatedCourses() {
        return createdCourses;
    }

    public List<JwtToken> getJwtTokens() {
        return jwtTokens;
    }

}
