package com.kelaniya.uni.studentapi;

public class Student {
    private String id;
    private String name;
    private int age;
    private String tp;

    public Student() {
        this.id =id;
        this.name = name;
        this.age = age;
        this.tp = tp;
    }
    public String getId(){
        return id;
    }
    public void set(String id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setId(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getTp(){
        return tp;
    }
    public void setTp(String tp){
        this.tp=tp;
    }
}
