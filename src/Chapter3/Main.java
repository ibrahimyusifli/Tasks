package Chapter3;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ibrahim", 1, 70);
        Student student2 = new Student("Nicat", 2, 100);
        Student student3 = new Student("Ali", 3, 90);
        Student student4 = new Student("Azer", 4, 50);
        Student student5 = new Student("Ayshen", 5, 80);
        Student student6 = new Student("Nubar", 6, 60);
        Student student7 = new Student("Shams", 7, 75);
        Student student8 = new Student("Fidan", 8, 65);
        Student student9 = new Student("Amin", 9, 55);
        Student student10= new Student("Nurlan", 10, 95);

        Storing.add(student1);
        Storing.add(student2);
        Storing.add(student3);
        Storing.add(student4);
        Storing.add(student5);
        Storing.add(student6);
        Storing.add(student7);
        Storing.add(student8);
        Storing.add(student9);
        Storing.add(student10);

        System.out.println("All students:");
        Storing.printAllStudents();

        Storing.printAllStudentsGradeGreaterThan(60);

    }
}
