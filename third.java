// Q3. Group Employees by Department
// Group a list of employees by their department.

import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class third {
    public static void main(String[] args)
    {
        LinkedHashMap<String, LinkedHashMap<String, Employee>> departmentMap = new LinkedHashMap<>();
        Employee[] employees = {
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Charlie", "HR"),
            new Employee("David", "Finance")
        };

        for(Employee employee : employees)
        {
            departmentMap.putIfAbsent(employee.department, new LinkedHashMap<>());
            departmentMap.get(employee.department).put(employee.name, employee);
        }

        for(Map.Entry<String, LinkedHashMap<String, Employee>> entry : departmentMap.entrySet())
        {
            System.out.println("Department: " + entry.getKey());
            for(Map.Entry<String, Employee> empEntry : entry.getValue().entrySet())
            {
                System.out.println(empEntry.getKey() + " works in " + empEntry.getValue().department);
            }
        }
    }
}
