package Chapter3;

public final class Student {
    public final String name;
    public final int id;
    public final int grade;

    public Student(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}
