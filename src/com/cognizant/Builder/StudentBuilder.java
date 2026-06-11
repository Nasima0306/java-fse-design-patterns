package com.cognizant.Builder;

public class StudentBuilder {

    String name;
    int age;
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public  StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public Student build(){
        return new Student(name,age);
    }



}
