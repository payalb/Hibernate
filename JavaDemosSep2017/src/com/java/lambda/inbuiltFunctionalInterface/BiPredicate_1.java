package com.java.lambda.inbuiltFunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicate_1 {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Raj");
		Employee e2 = new Employee(2, "Rahul");
		Employee e3 = new Employee(3, "Ravi");
		Employee e4 = new Employee(4, "Rishi");
		Manager manager= new Manager(5, "Ram");
		List<Employee> list= new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		manager.setEmployees(list);
		BiPredicate<Manager, Employee> p = (m, e) -> m.getEmployees().contains(e);
		System.out.println(p.test(manager, e4));
		System.out.println(p.test(manager, e1));
	}
}

// Check manager is this employee manager or not
class Manager extends Employee{
	Manager(int id, String name){
		super(id, name);
	}
	List<Employee> employees = new ArrayList<>();
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}

class Employee {
	public Employee(int i, String string) {
		id = i;
		name = string;
	}

	int id;
	String name;
/*	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}*/
}