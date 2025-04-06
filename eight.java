// Q8. Average Salary by Department
// Return a map of department → average salary.
import java.util.*;
class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class eight {
    public static void main(String[] args)
    {
        Employee[] employees = {
            new Employee("Alice", "HR", 60000),
            new Employee("Bob", "IT", 45000),
            new Employee("Charlie", "HR", 70000),
            new Employee("David", "Finance", 50000)
        };

        Map<String, Double> departmentSalaryMap = new HashMap<>();
        Map<String, Integer> departmentCountMap = new HashMap<>();

        for (Employee employee : employees) {
            departmentSalaryMap.put(employee.department, departmentSalaryMap.getOrDefault(employee.department, 0.0) + employee.salary);
            departmentCountMap.put(employee.department, departmentCountMap.getOrDefault(employee.department, 0) + 1);
        }

        for (String department : departmentSalaryMap.keySet()) {
            double averageSalary = departmentSalaryMap.get(department) / departmentCountMap.get(department);
            System.out.println("Average salary in " + department + ": " + averageSalary);
        }
    }
}
