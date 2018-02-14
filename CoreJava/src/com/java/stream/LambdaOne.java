package com.java.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LambdaOne {

	public static void main(String args[]) {

		Person2 obj1 = new Person2();
		Person2 obj2 = new Person2();
		Person2 obj3 = new Person2();
		List<Person2> list = new ArrayList<>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		// Approach 3: Anonymous
		Person2.printPersons(list, new Criteria() {
			public boolean matchesCriteria(Person2 p) {
				if (p.getGender() == Person2.Sex.FEMALE && p.getAge() > 18) {
					return true;
				} else {
					return false;
				}
			}
		});

		// Approach 4: Lambda
		/*
		 * Variant 1.(parameters) -> expression– In this variant the return type
		 * of the lambda expression will be same as the resultant type of the
		 * expression Variant 2.(parameters) -> {statements;} – In this variant,
		 * there will be no return type(or void return type) unless the
		 * statements inside the curly braces explicitly return something at the
		 * end. In that case the return type will be same as the type of the
		 * variable returned.
		 */
		Person2.printPersons(list, p -> p.getGender() == Person2.Sex.FEMALE
				&& p.getAge() > 18);

	}

}

class Person1 {

	public enum Sex {
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	public int getAge() {
		return 20;
	}

	public Sex getGender() {
		return gender;
	}

	public void printPerson() {
		System.out.println("name: " + name + ", birth date: " + birthday
				+ ", gender: " + gender + " , email id: " + emailAddress);
	}

	// Approach 1
	public static void printPersonsOlderThan(List<Person1> roster, int age) {
		for (Person1 p : roster) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}
	}

	public static void printPersonsWithinAgeRange(List<Person1> roster,
			int low, int high) {
		for (Person1 p : roster) {
			if (low <= p.getAge() && p.getAge() < high) {
				p.printPerson();
			}
		}
	}
}

class Person2 {

	public enum Sex {
		MALE, FEMALE
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	public Sex getGender() {
		return gender;
	}

	public int getAge() {
		return 20;
	}

	public void printPerson() {
		System.out.println("name: " + name + ", birth date: " + birthday
				+ ", gender: " + gender + " , email id: " + emailAddress);
	}

	public static void printPersons(List<Person2> roster, Criteria c) {
		for (Person2 p : roster) {
			if (c.matchesCriteria(p)) {
				p.printPerson();
			}
		}
	}

}

@FunctionalInterface
interface Criteria {

	public boolean matchesCriteria(Person2 p);

}

// Approach 2
class AgeGreaterThan18Criteria implements Criteria {

	@Override
	public boolean matchesCriteria(Person2 p) {
		if (p.getAge() < 18) {
			return false;
		} else {
			return true;
		}
	}

}

class FemaleCriteria implements Criteria {

	@Override
	public boolean matchesCriteria(Person2 p) {
		if (p.getGender() == Person2.Sex.MALE) {
			return false;
		} else {
			return true;
		}
	}

}