
package com.example.universityacademic.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;

    @Column(nullable = false, unique = true)
    private String departmentName;

    @Column(nullable = false, unique = true)
    private String departmentCode;

    // One department has many students
    @OneToMany(mappedBy = "department")
    private List<Student> students = new ArrayList<>();

    // One department employs many lecturers
    @OneToMany(mappedBy = "department")
    private List<Lecturer> lecturers = new ArrayList<>();

    // One department offers many courses
    @OneToMany(mappedBy = "department")
    private List<Course> courses = new ArrayList<>();

    // Each department has one head lecturer
    @OneToOne
    @JoinColumn(name = "head_lecturer_id", unique = true)
    private Lecturer headLecturer;

    public Department() {
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Lecturer> getLecturers() {
        return lecturers;
    }

    public void setLecturers(List<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Lecturer getHeadLecturer() {
        return headLecturer;
    }

    public void setHeadLecturer(Lecturer headLecturer) {
        this.headLecturer = headLecturer;
    }
}

