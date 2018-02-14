package springDev.java.com.day2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dao2 {	
/*@Qualifier(value="engine1")
@Autowired*/
/*
 * Need no setter, constructor 
 */
private Engine2 engine;

public void printData(){
	System.out.println(engine.getModelYear());
}
}

//@Component
/*
 * If class has primitive type, should not create class objects automatically
 * so cannot use @Component
 */
class Engine2{
	private String modelYear;
	/*
	 * For primitive, we have to inject using setter/ constructor. We cannot
	 * use component scan for this.
	 */

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public String getModelYear() {
		return modelYear;
	}


}