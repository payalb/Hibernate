package com.hmei.hibernate.Assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Integer> list= Arrays.asList(1,3,5,6,7);
    	System.out.println(list.stream().reduce(21, (a,b)-> a+b));
    	
    	list.stream().reduce(21, new BinaryOperator<Integer, Integer>() {

			@Override
			public Object apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t+u;
			}
    		
    	});
    	//23+ 1+3+5+6+7
}
}

class Detail{
	
int id;

List<String> pages=new ArrayList<>();

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}



public Detail(int id, List<String> pages) {
	super();
	this.id = id;
	this.pages = pages;
}

public List<String> getPages() {
	return pages;
}

public void setPages(List<String> pages) {
	this.pages = pages;
}
	
}
	
	
	
	
	
	
	/*Address addr1 = new Address();
		addr1.setHouseNo(123);
		addr1.setStreet("Lituanica Ave");
		addr1.setCity("Chicago");
		addr1.setState("ILINOIS");
		addr1.setZipCode(60608);
		
		Address addr2 = new Address();
		addr2.setHouseNo(234);
		addr2.setStreet("Archer Ave");
		addr2.setCity("Chicago");
		addr2.setState("ILINOIS");
		addr2.setZipCode(60608);
		
		Address addr3 = new Address();
		addr3.setHouseNo(333);
		addr3.setStreet("31st Street");
		addr3.setCity("Saint Charles");
		addr3.setState("ILINOIS");
		addr3.setZipCode(60174);
		
		Address addr4 = new Address();
		addr4.setHouseNo(1234);
		addr4.setStreet("Washington Street");
		addr4.setCity("Minneapolis");
		addr4.setState("Minisota");
		addr4.setZipCode(55111);
		
		Address addr5 = new Address();
		addr5.setHouseNo(3408);
		addr5.setStreet("Normal Street");
		addr5.setCity("Los Angeles");
		addr5.setState("California");
		addr5.setZipCode(90001);
		
		Address addr6 = new Address();
		addr6.setHouseNo(2417);
		addr6.setStreet("WentWorth Street");
		addr6.setCity("San Francisco");
		addr6.setState("California");
		addr6.setZipCode(94016);

		Student stu1 = new Student();
		stu1.setName("Hao1");
		stu1.setEmail("hao1@gmail.com");
		stu1.setMark(90);
		Set<Address> set1 = new HashSet<>();
		set1.add(addr1);
		set1.add(addr3);
		stu1.setAddress(set1);
		addr1.setStudent(stu1);
		addr3.setStudent(stu1);
		
		
		Student stu2 = new Student();
		stu2.setName("Hao2");
		stu2.setEmail("hao2@gmail.com");
		stu2.setMark(37);
		Set<Address> set2 = new HashSet<>();
		set2.add(addr2);
		addr2.setStudent(stu2);
		stu2.setAddress(set2);
		
		
		Student stu3 = new Student();
		stu3.setName("Hao3");
		stu3.setEmail("hao3@gmail.com");
		stu3.setMark(50);
		Set<Address> set3 = new HashSet<>();
		set3.add(addr4);
		set3.add(addr6);
		stu3.setAddress(set3);
		addr4.setStudent(stu3);
		addr6.setStudent(stu3);

		StudentDao.insertStudent(stu1);
		StudentDao.insertStudent(stu2);
		StudentDao.insertStudent(stu3);
		
		AddressDao.saveAddress(addr5);
    		
//Get all student Details by particular id---using second level caching
    		*/
//    		Student student1 = StudentDao.getStudent(1);
//    		System.out.println(student1);
//    		      
//    		Student student2 = StudentDao.getStudent(1);
//    		System.out.println(student2);
    		
//Get all students' details---using second level caching
    		
    	/*	List<Student> list = StudentDao.getAllStudents();
    		System.out.println(list);
    		
    		List<Student> list1 = StudentDao.getAllStudents();
    		System.out.println(list1);
*/
//Get students whose marks are greater than 40---Use query cache for this
//        List<Student> result = StudentDao.getStudentsMarkGreaterThan(40);
//        System.out.println(result);
//        
//        List<Student> result1 = StudentDao.getStudentsMarkGreaterThan(40);
//        System.out.println(result1);
    	
    	
//    	System.out.println(StudentDao.getStudentsMarkGreaterThan(40));
//    	System.out.println(StudentDao.getStudentsMarkGreaterThan(40));
    

