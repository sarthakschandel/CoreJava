package sortingobjects;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>();
		set.add(new Employee(100, "Obama"));
		set.add(new Employee(400, "Tom"));
		set.add(new Employee(300, "Bharath"));
		set.add(new Employee(200, "Rambo"));
		
		System.out.println("Sorting according to Employee ID via Comparable");
		for (Employee employee : set) {
			System.out.println(employee.id);
			System.out.println(employee.name);
		}
		
		Set<Employee> set1 = new TreeSet<>(new EmployeeNameComparator());
		set1.add(new Employee(100, "Obama"));
		set1.add(new Employee(400, "Tom"));
		set1.add(new Employee(300, "Bharath"));
		set1.add(new Employee(200, "Rambo"));
		
		System.out.println("Sorting according to Employee Name via Comparator");
		for (Employee employee : set1) {
			System.out.println(employee.id);
			System.out.println(employee.name);
		}

	}

}
