package Lambada;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String ename;
	int esalary;
	int eexperience;

	Employee(String name, int salary, int experience) {
		ename = name;
		esalary = salary;
		eexperience = experience;
	}
}

public class Demo2 {

	public static void main(String[] args) {

		// eample 1
		Employee emp = new Employee("Ghate", 1000, 10);

		Predicate<Employee> pr = e -> (e.esalary >= 30000 && e.eexperience >= 10);
		System.out.println(pr.test(emp));

		// example 2

		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("az", 100000, 10));
		al.add(new Employee("fef", 10, 13));
		al.add(new Employee("ef", 1000, 8));
		al.add(new Employee("d", 100, 6));
		al.add(new Employee("Ghwate", 130000, 13));
		for (Employee e : al) {
			if (pr.test(e)) {
				System.out.println(e.ename + " " + e.esalary);
			}
		}

	}
}
