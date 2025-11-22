package Lambada.Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {

	String ename;
	int esalary;

	Employee(String ename, int esalary) {
		this.ename = ename;
		this.esalary = esalary;
	}

}

public class Demo2 {

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee("ghate", 10000));
		emp.add(new Employee("hk", 60000));
		emp.add(new Employee("pl", 20000));
		emp.add(new Employee("xy", 8000));

		Function<Employee, Integer> f = n -> {
			int sal = n.esalary;
			if (sal > 10000 && sal <= 20000) {
				return (sal * 10 / 100);

			} else if (sal > 20000 && sal < 30000) {
				return (sal * 20 / 100);

			} else {
				return (sal * 40 / 100);
			}
		};

		Predicate<Integer> pre = n -> (n > 4000);

		for (Employee e : emp) {

			int bonus = f.apply(e);
			if (pre.test(bonus)) {

				System.out.println(e.ename + " " + e.esalary);
				System.out.println("Bonus is " + bonus);
			}
		}

	}

}
