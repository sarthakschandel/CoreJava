package ashCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    String departmentName;
    String employeeName;

    Employee(String departmentName, String employeeName) {
        this.departmentName = departmentName;
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee Name: " + employeeName + ", Department: " + departmentName;
    }

    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee> employees = new ArrayList<>();

        // Add 5 Employee objects to the list
        employees.add(new Employee("IT", "Alice"));
        employees.add(new Employee("HR", "Bob"));
        employees.add(new Employee("Finance", "Charlie"));
        employees.add(new Employee("IT", "David"));
        employees.add(new Employee("Finance", "Eve"));
        
        //initially list 
        System.out.println("Initial List:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Sort employees based on departmentName using Comparator
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.departmentName.compareTo(e2.departmentName);
            }
        });

        // Print the sorted list of employees
        System.out.println("Employees sorted by department:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
