package springDev.java.com.day2;

import org.springframework.beans.factory.annotation.Required;

public class DepCheck1 {

	private String name;
	private int no;
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
}
