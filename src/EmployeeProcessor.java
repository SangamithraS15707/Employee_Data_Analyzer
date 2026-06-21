import java.util.Optional;
public class EmployeeProcessor extends Thread{
    private int employeeId;
    private EmployeeManager employeeManager;
    EmployeeProcessor( EmployeeManager employeeManager,int employeeId){
        this.employeeId = employeeId;
        this.employeeManager = employeeManager;
    }
    @Override
    public void run() {
        try{Optional<Employee> employee = employeeManager.getEmployeeById(employeeId);
        employee.ifPresentOrElse(
            e -> System.out.println("Employee found: " + e),
            () -> System.out.println("Employee with ID " + employeeId + " not found.")
        );
    } catch (Exception e) {
        System.err.println("Error occurred while processing employee with ID " + employeeId);
    }
}
}