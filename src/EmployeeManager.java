import java.util.*;
import java.util.stream.Collectors;
public class EmployeeManager {
    private Map<Integer, Employee> employees;
    public EmployeeManager() {
        employees = new HashMap<>();
    }
    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }
    public Optional<Employee> getEmployeeById(int id) {
        return Optional.ofNullable(employees.get(id));
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    public List<Employee> filterEmployeesBySalary(double minSalary){
        return employees.values().stream()
        .filter(employee -> employee.getSalary().orElse(0.0) >= minSalary)
        .collect(Collectors.toList());
    }

    public List<Employee> sortEmployeesBySalary(){
        return employees.values().stream()
        .sorted(Comparator.comparingDouble(employee -> employee.getSalary().orElse(0.0)))
        .collect(Collectors.toList());
    }


}
