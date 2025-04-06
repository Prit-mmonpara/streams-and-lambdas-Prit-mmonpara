// Q11. Departments with No Employees
// Given a list of departments and a list of employees, return the names of departments with no employees assigned.
import java.util.*;
class Employee{
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class eleven {
    public static void main(String[] args)
    {
        Employee[] employees = {
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Charlie", "Finance")
        };
        String[] departments = {"HR", "IT", "Finance", "Marketing", "Sales"};   

        Set<String> employeeDepartments = new HashSet<>();
        for (Employee employee : employees) {
            employeeDepartments.add(employee.department);
        }
        List<String> noEmployeeDepartments = new ArrayList<>();
        for (String department : departments) {
            if (!employeeDepartments.contains(department)) {
                noEmployeeDepartments.add(department);
            }
        }
        System.out.println("Departments with no employees: " + noEmployeeDepartments);
    }
}
