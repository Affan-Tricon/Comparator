package org.example;

import java.util.*;



    class ID_COMPARATOR implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.id, s2.id);
        }
    };

    class  NAME_COMPARATOR implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }
    };

    class  GRADE_COMPARATOR implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return Character.compare(s1.grade, s2.grade);
        }
    };

    class  AGE_COMPARATOR implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.age, s2.age);
        }
    };

public class Main {
    public static void sortStudents(Student[] students, Comparator<Student> comparator) {
        Arrays.sort(students, comparator);
    }
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Affan", 'A', 23),
                new Student(2, "Hari", 'B', 25),
                new Student(3, "Navneet", 'A', 24)
        };

        System.out.println("Sorting by ID:");
        sortStudents(students, new ID_COMPARATOR());
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nSorting by Name:");
        sortStudents(students, new NAME_COMPARATOR());
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nSorting by Grade:");
        sortStudents(students, new GRADE_COMPARATOR());
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nSorting by Age:");
        sortStudents(students, new AGE_COMPARATOR());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}