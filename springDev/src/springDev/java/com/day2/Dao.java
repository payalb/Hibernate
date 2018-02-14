package springDev.java.com.day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

 class Car {	
private Engine engine;
public Engine getEngine() {
	return engine;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}
public void printData(){
	System.out.println(engine.getModelYear());
}
}
@Component
class Engine{
	@Value("1987")
	private String modelYear;

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
}

class Triangle{
	
	private Engine e1, e2;
	private Triangle(Engine e1, Engine e2){
		this.e1= e1;
		this.e2= e2;
	}
	public void print(){
		System.out.println(this.e1.getModelYear());
		System.out.println(this.e2.getModelYear());
	}
}