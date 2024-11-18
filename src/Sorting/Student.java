package Sorting;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    //Student name, age, Comporable age,comarator name ,name lengs desenning en uzun 1ci

    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

    @Override
    public String toString()
    {
        return String.format("Student{name=%s, age=%d}", name, age);
    }
}






