package tamirlan.Comparing_people;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainCompare {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Collections.addAll(students,
                new Student("Tamirlan", 3.5, "Management1"),
                new Student("Erlan", 3.3, "SIS12"),
                new Student("Arman", 3.2, "Vtipo"));

        Collections.sort(students, new SortByName());
        System.out.println(students);
    }
}

class Student  {
    private String name;
    private double gpa;
    private String group;

    public Student(String name, double gpa, String group) {
        this.name = name;
        this.gpa = gpa;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", group='" + group + '\'' +
                '}';
    }


}

class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}
