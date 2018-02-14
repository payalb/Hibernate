package springDev.java.com.day2;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;


@Component
public class Dao3 {	

private static String name;
private static String type;
/*@Autowired*/
private static Engine e;
public static Engine getE() {
	return e;
}
@Resource
public static void setE(Engine e) {
	Dao3.e = e;
}

public static String getName() {
	return name;
}
static{
	name="Myname";
	type="MyType";
	/*e= new Engine();
	e.setModelYear("1998");
	System.out.println(name);*/
}
public static void setName(String name, String type) {
	Dao3.name = name;
	Dao3.type= type;
}

public static void hello(){
	System.out.println("hello"+ name+ type);
}

public static Engine hello1(){
	/*Engine e= new Engine();
	e.setModelYear("1937");*/	
	return e;
}
}

