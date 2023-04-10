package tamirlan.tasks;

public class DeanOffice {
    String name;
    Student students[] = new Student[1000];
    int index = 0;


    public DeanOffice(String name) {
        this.name = name;
    }

    void addStudent(Student student) {
        students[index] = student;
        index++;
    }

    void printAllStudents() {
        // 3
        for (int i = 0; i < index; i++) {
            System.out.println(students[i]);
        }
    }

    double getAverageGPA() {
        double sum = 0;
        for (int i = 0; i < index; i++) {
            sum += students[i].gpa;
        }

        return sum/index;
    }

    Student getMaxGPA() {
        double max = Double.MIN_VALUE;
        Student studentMaxGPA = null;
        for (int i = 0; i < index; i++) {
            if (max < students[i].gpa){
                max = students[i].gpa;
                studentMaxGPA = students[i];
            }
        }

        return studentMaxGPA;
//        List<Student> students = Arrays.stream(this.students).sorted(Comparator.comparing(Student::getGpa)).toList();
//        return students.get(students.size()-1);
    }




}
