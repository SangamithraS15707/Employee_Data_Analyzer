import java.util.Optional;
class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, String department,double salary) {
        this.id = id;
        this.name = name;
       
        this.department = department;
         this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Optional<Double> getSalary() {
        return Optional.ofNullable(salary);
    }

    public String getDepartment() {
        return department;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}