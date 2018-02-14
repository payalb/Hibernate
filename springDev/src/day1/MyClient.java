package day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public class MyClient {
	
	static ApplicationContext context= new AnnotationConfigApplicationContext(MyConfig.class);// 1 container 2 beans
	static Service1 obj= context.getBean("service1", Service1.class); //obj should be initialized

	public static void main(String[] args) {
		
		Student student= new Student(1,"Payal");
		
		obj.save(student);
	}
	
	}

 
interface Service1{
	void save(Student st);
	@Required	
	public void setRep(Repository1 rep);
}

class MyService implements Service1{
	
//	ApplicationContext context;
	
	Repository1 rep; //initialize this rep
	
	MyService(){
		//this.rep= rep;
		System.out.println("Constructor called");
	}
	public void save(Student st) {
	//	rep= context.getBean("repository", Repository.class);	
		rep.save(st);
	}
	public Repository1 getRep() {
		return rep;
	}
	
	@Required
	public void setRep(Repository1 rep) {
		this.rep = rep;
	}


/*	//Is called after object of this class is created
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		
	}*/
	
}

//MyRepository1

interface Repository1{
	
	void save(Student st);
}

class MyRepository implements Repository1{
	
	List<Student> list =new ArrayList<>();
	
	public void save(Student st) {
		list.add(st);
	}
}


class MyRepository1 implements Repository1{
	
	Map<Integer, Student> map= new HashMap<>();

	@Override
	public void save(Student st) {
		map.put(st.getId(), st);
		
	}
	
}
class Student{
	
	int id;
	String name;
	PhoneNumber phNumber;
	String uanNumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public PhoneNumber getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(PhoneNumber phNumber) {
		this.phNumber = phNumber;
	}
	public String getUanNumber() {
		return uanNumber;
	}
	public void setUanNumber(String uanNumber) {
		this.uanNumber = uanNumber;
	}
	
	
}