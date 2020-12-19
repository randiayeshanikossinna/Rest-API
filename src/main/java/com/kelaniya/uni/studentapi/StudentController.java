package com.kelaniya.uni.studentapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    /*@PostMapping("/Student")
        public void addStudent(){
            //implementation to add the new student into the system
            System.out.println("Adding a new student into the system");
            //End of implementation
        }
         */
    @GetMapping("/Student")
    public Student getStudent(@RequestParam String id){
        System.out.println("Getting student details");

        StudentRepositary StudentRepositary =new InMemoryStudentRepository();
        Student student = StudentRepositary.getStudent(id);
        
        return student;
    }
}
