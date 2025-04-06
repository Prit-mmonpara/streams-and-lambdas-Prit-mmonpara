// Q4. Employee with Max Salary
// Find the employee with the highest salary from the list.

class Employee{
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

public class four {
    public static void main(String[] args)
    {
        Employee[] employees = {
            new Employee("Alice", 60000),
            new Employee("Bob", 45000),
            new Employee("Charlie", 70000),
            new Employee("David", 50000)
        };

        Employee emp = null;
        double maxSalary = 0;
        for(Employee employee: employees)
        {
            if(employee.salary > maxSalary)
            {
                maxSalary = employee.salary;
                emp = employee;
            }
        }
        System.out.println("Employee with max salary: " + emp.name + " earns " + emp.salary);
    }
}
