// Given a list of Employee objects, return all employees whose salary is greater than 50,000.

class Employee {
    String name;
    double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
}

public class first{
    public static void main(String[] args)
    {
        Employee[] employees = {
            new Employee("Alice", 60000),
            new Employee("Bob", 45000),
            new Employee("Charlie", 70000),
            new Employee("David", 50000)
        };

        for (Employee employee : employees) {
            if (employee.salary > 50000) {
                System.out.println(employee.name + " earns " + employee.salary);
            }
        }
    }
}