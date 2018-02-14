package com.java.collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class MyListDemo {

	public static void main(String[] args) {
		/*Set<String> subjects= new HashSet<>();
		subjects.add("Maths");
		subjects.add("Science");
		subjects.add("English");
		subjects.add("English");
		Student student1= new Student(1, "payal");
		List<Integer> marks1= new LinkedList<Integer>();
		marks1.add(45);
		marks1.add(36);
		marks1.add(98);
		student1.setMarks(marks1);
		student1.setSubjects(subjects);
		Student student2= new Student(2, "priya");
		List<Integer> marks2= new LinkedList<>();
		marks2.add(45);
		marks2.add(0);
		marks2.add(98);
		student2.setMarks(marks2);
		student2.setSubjects(subjects);
		Student student3= new Student(3, "rahul");
		List<Integer> marks3= new LinkedList<>();
		marks3.add(45);
		marks3.add(40);
		marks3.add(98);
		student3.setMarks(marks3);
		student3.setSubjects(subjects);
		Student student4= new Student(4, "riya");
		List<Integer> marks4= new LinkedList<>();
		marks4.add(23);
		marks4.add(13);
		marks4.add(24);
		student4.setMarks(marks4);
		student4.setSubjects(subjects);
		Set<Student> students= new TreeSet<>(new StudentComparator());
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
	//	System.out.println(students);
		
		Map<Student, List<Integer>> map= new HashMap<>();
		map.put(student1, marks1);
		map.put(student2, marks2);
		map.put(student3, marks3);
		map.put(student4, marks4);*/
		
		//System.out.println(map);
		
		//System.out.println(map.get(student2));
		
	/*	for(Student s: map.keySet()){
			System.out.println(s+" : "+ map.get(s));
		}*/
		
	//	System.out.println(map.values());
		//map.remove(student1);
	/*	
		student1.setName("Gauri");
		for(Map.Entry<Student, List<Integer>>entry : map.entrySet()){
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
		System.out.println(map.get(student1));*/
	/*	Set<String> subjects= new HashSet<>();
		subjects.add("Maths");
		subjects.add("Science");
		subjects.add("English");

		Student student1= new Student(1, "Payal", subjects, marks1);
		student1.getSubjects().add("History");
		subjects.add("History");
		System.out.println(student1);*/
		List<Integer> marks1= new LinkedList<Integer>();
		marks1.add(45);
		marks1.add(36);
		marks1.add(98);
		Set<String> subjects= new HashSet<>();
		subjects.add("Maths");
		subjects.add("Science");
		subjects.add("English");
		subjects.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				if(t.startsWith("S"))
					return true;
				return false;
			}
			
			
		});
		Spliterator<Integer> it= marks1.spliterator();
		while(it.tryAdvance(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				t= t+25;
			}
		}))
			System.out.println(marks1);
		subjects.removeIf(s-> s.startsWith("S"));
		String[] subArr= subjects.toArray(new String[subjects.size()]);
		System.out.println(subArr);
		System.out.println(subjects);
	//	Student student1= new Student(1, "Payal", subjects, marks1);
		//student1.clone();
	}

}
