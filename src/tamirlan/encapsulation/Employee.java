package tamirlan.encapsulation;

public class Employee {
    private int id;
    private String name;
    private String company;
    private double salary;
    private static int idCount = 1;

    public Employee(String name, String company, double salary) {
        this.id = idCount;
        this.name = name;
        this.company = company;
        this.salary = salary;
        idCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
