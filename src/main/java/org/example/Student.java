package org.example;

public class Student {
    public int id;
    public String name;
    public char grade;
    public int age;

    public Student(int id, String name, char grade, int age) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", grade=" + grade +", age=" + age + '}';
    }
}

