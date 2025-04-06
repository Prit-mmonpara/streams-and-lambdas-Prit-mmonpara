// Q7. Partition Employees by Experience
// Given a list of employees, partition them into two groups:

// Experience >= 5 years
// Experience < 5 years

import java.util.LinkedList;

class Employee {
    String name;
    int experience;

    Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }
}

class seven{
    public static void main(String[] args)
    {
        Employee[] employees = {
            new Employee("Alice", 6),
            new Employee("Bob", 3),
            new Employee("Charlie", 5),
            new Employee("David", 2)        
        };

        LinkedList<Employee> experienced = new LinkedList<>();
        LinkedList<Employee> inexperienced = new LinkedList<>();

        for(Employee employee: employees)
        {
            if(employee.experience >= 5)
            {
                experienced.add(employee);
            }
            else
            {
                inexperienced.add(employee);
            }
        }

        for(Employee emp: experienced)
        {
            System.out.println(emp.name + " has " + emp.experience + " years of experience.");
        }
        System.out.println("-----");
        for(Employee emp: inexperienced)
        {
            System.out.println(emp.name + " has " + emp.experience + " years of experience.");
        }
    }
}