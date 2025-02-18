import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserInterface {
    private Map<String, Double> employeeMap = new HashMap<>();

    public void addEmployeeDetails(String employeeName, double salary) {
        employeeMap.put(employeeName, salary);
    }

    public static EmployeeAudit findEmployee(Map<String, Double> employeeMap) {
        return (salary) -> employeeMap.entrySet().stream()
                .filter(entry -> entry.getValue() <= salary)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public Map<String, Double> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<String, Double> employeeMap) {
        this.employeeMap = employeeMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserInterface ui = new UserInterface();

        while (true) {
            System.out.println("1. Add Employee details");
            System.out.println("2. Find Employee details");
            System.out.println("3. Exit");
            System.out.println("Enter the choice");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the Employee name");
                    String name = sc.nextLine();
                    System.out.println("Enter the Employee Salary");
                    double salary = sc.nextDouble();
                    ui.addEmployeeDetails(name, salary);
                    break;
                case 2:
                    System.out.println("Enter the salary to be searched");
                    double searchSalary = sc.nextDouble();
                    EmployeeAudit audit = findEmployee(ui.getEmployeeMap());
                    ArrayList<String> employees = audit.fetchEmployeeDetails(searchSalary);
                    if (employees.isEmpty()) {
                        System.out.println("No Employee Found");
                    } else {
                        System.out.println("Employee List");
                        employees.forEach(System.out::println);
                    }
                    break;
                case 3:
                    System.out.println("Let's complete the session");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}