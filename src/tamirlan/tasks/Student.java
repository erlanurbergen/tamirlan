package tamirlan.tasks;

public class Student {
    // attributes
    // methods
    int id;
    String name;
    Group group;
    double gpa;

    public Student() {
    }

    public double getGpa() {
        return gpa;
    }

    public Student(int id, String name, Group group, double gpa) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group=" + group +
                ", gpa=" + gpa +
                '}';
    }
}
