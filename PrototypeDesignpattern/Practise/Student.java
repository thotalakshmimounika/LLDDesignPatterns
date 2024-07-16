package PrototypeDesignpattern.Practise;

import java.io.Serializable;

public class Student implements Prototype{
    String name;
    int age;
    int id;
    Student(){

    }
    Student( Student other){
        other.name = this.name;
        other.age = this.age;
        other.id = this.id;
    }
    @Override
    public Student copy() {
        Student s = new Student(this);
        return s;
    }
}
