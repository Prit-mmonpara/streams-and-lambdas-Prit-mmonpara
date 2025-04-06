// Q9. Top 3 Salaries
// Return the names of the top 3 highest-paid employees.
import java.util.*;
class Employee{
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class nine {
    public static void main(String[] args)
    {
        Employee[] employees = {
            new Employee("Alice", 60000),
            new Employee("Bob", 45000),
            new Employee("Charlie", 70000),
            new Employee("David", 50000),
            new Employee("Eve", 80000)
        };

        Arrays.sort(employees, (a, b) -> Double.compare(b.salary, a.salary));

        System.out.println("Top 3 highest-paid employees:");
        for (int i = 0; i < 3 && i < employees.length; i++) {
            System.out.println(employees[i].name + " earns " + employees[i].salary);
        }
    }
}
