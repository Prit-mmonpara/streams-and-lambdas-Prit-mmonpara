// Q10. Sort Employees by Salary (Descending)
// Return the list of employees sorted by salary in descending order.
import java.util.*;
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " earns " + salary;
    }
}
public class ten {
    public static void main(String[] args)
    {
        Employee[] employees = {
            new Employee("Alice", 60000),
            new Employee("Bob", 45000),
            new Employee("Charlie", 70000),
            new Employee("David", 50000)
        };

        Arrays.sort(employees, (a, b) -> Double.compare(b.salary, a.salary));

        System.out.println("Employees sorted by salary in descending order:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
