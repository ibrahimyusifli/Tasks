package Chapter3;

import java.sql.SQLOutput;

public class Storing {
    public static Student[] students = new Student[10];

    public static void add(Student student) {
        for (int i = 0; i <= 10; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            } else if (students[9] != null) {
                System.out.println("Array is full, cannot add more students.");
                break;
            }

        }
    }

    public static void printAllStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
            break;
        }

    }

    public static void printAllStudentsGradeGreaterThan(int grade) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].grade > 70) {
                System.out.println(students[i].toString());
            }
        }
    }


}
