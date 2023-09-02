package com.codewithamrita.classdetail;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController //Telling the java application -->this class will contain api endpoints

public class StudentController {
    //database
    HashMap<Integer,Student>studentDb=new HashMap<>();
    //add a Student
    @PostMapping("/add_student")

    public String addStudent(@RequestBody() Student student){
          int key= student.id;
          //add it in database
        studentDb.put(key,student);
        return "student added successfully" ;
    }

    //get student by id

    @GetMapping("get_student_by_id")
    public Student getStudentById(@RequestParam("id") Integer id ){return studentDb.get(id);
    }
}
