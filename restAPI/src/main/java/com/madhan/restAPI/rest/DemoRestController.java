package com.madhan.restAPI.rest;

import com.madhan.restAPI.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DemoRestController {

    List<Student> students;
    @PostConstruct
    public void loadData(){
        students = new ArrayList<>();
        students.add(new Student("ravi", "kumar"));
        students.add(new Student("suresh", "yadav"));
        students.add(new Student("mahesh", "reddy"));
    }

    @GetMapping("/hello")
    public String getHello(){
        return "hello world!!!";
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        if((studentId >= students.size()) || studentId <= 0){
            throw new StudentNotFoundException("Student not found - " + studentId);
        }
        return students.get(studentId);
    }

}
