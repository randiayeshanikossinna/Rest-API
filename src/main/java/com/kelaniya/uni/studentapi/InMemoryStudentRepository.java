package com.kelaniya.uni.studentapi;

import java.util.HashMap;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepositary {

    Map<String,Student> StudentMap =new HashMap<>();

    public InMemoryStudentRepository(){
        Student kamal=new Student();
        Student nimal=new Student();

        StudentMap.put("1",kamal);
        StudentMap.put("2",nimal);
    }
    @Override
    public Student getStudent(String id) {
        return StudentMap.get(id);
    }
}
