package com.st.st.controller;

import com.st.st.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student")

    public Student getStudent() {
//        Student student =new Student(id:1,firstName:"shyam",lastName:"kumar");already constructor
        Student student = new Student(1, "shyam", "Kumar");

        return student;
    }

    @GetMapping("students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "gaensh", "sharma"));
        students.add(new Student(2, "virat", "kohli"));
        students.add(new Student(3, "dhoni", "mahi"));
        return students;
    }

    @GetMapping("students/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(@PathVariable int id, @PathVariable("first-name") String firstName, @PathVariable("last-name") String lastName){
        return new Student(id,firstName,lastName);
    }

    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam int id, @RequestParam String firstName, @RequestParam String lastName){
        return new Student(id,firstName,lastName);
    }
}