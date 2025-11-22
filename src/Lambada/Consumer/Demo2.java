package Lambada.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String ename;
	int salary;
	String gender;

	public Employee(String ename, int salary, String gender) {
		this.ename = ename;
		this.salary = salary;
		this.gender = gender;
	}
}

public class Demo2 {
	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Ghate", 30000, "male"));
		emp.add(new Employee("ms", 200000, "female"));

		emp.add(new Employee("dg", 500000, "male"));

		Function<Employee, Integer> f = e -> (e.salary * 10 / 100);/// task1
		Predicate<Integer> p = n -> (n > 5000); // task2

		// Consumer

		Consumer<Employee> c1 = c -> {
			System.out.println(c.ename);
			System.out.println(c.salary);
			System.out.println(c.gender);
		}; // task3

		for (Employee e : emp) {
				
			int bonus=f.apply(e); //calculate bonus
			if(p.test(bonus))  //invoke predicate
			{
				c1.accept(e); //invoke consumer
				System.out.println(bonus);
			}
			
		}

	}

}
