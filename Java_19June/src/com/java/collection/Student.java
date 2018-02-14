package com.java.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student implements Comparable<Student> {

	private int rollNumber;
	private String name;
	private Set<String> subjects;
	private List<Integer> marks ;

	public Student(int rollNumber, String name, Set<String> subjects,
			List<Integer> marks) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.subjects = new HashSet<>(subjects);
		this.marks = new ArrayList<>(marks);
		setPercentage();
	}

	private float percentage;

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public Set<String> getSubjects() {
		return new HashSet<>(subjects);
	}

	public List<Integer> getMarks() {
		return new ArrayList<>(marks);
	}

	public float getPercentage() {
		return percentage;
	}

	private void setPercentage() {
		float sum = 0;

		for (Integer i : marks)
			sum = sum + i;
		if (!marks.isEmpty())
			percentage = sum / marks.size();

	}

	@Override
	public String toString() {
		return name + " " + rollNumber + "" + marks + "" + percentage + ""
				+ subjects;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + subjects.hashCode();

	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Student) {
			Student obj = (Student) o;
			if (this.getRollNumber() == obj.getRollNumber()
					&& this.getMarks() == obj.getMarks()
					&& this.getSubjects() == obj.getSubjects()
					&& this.getName() == obj.getName()) {
				return true;
			}
			return false;
		}
		throw new RuntimeException("Cannot make this entry: Invalid object");
	}

	// @Override
	public int compareTo(Student obj) {
		if (this.getRollNumber() == obj.getRollNumber()) {
			return 0;
		}
		return this.getName().compareTo(obj.getName());
	}

}

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return 1;

	}

}