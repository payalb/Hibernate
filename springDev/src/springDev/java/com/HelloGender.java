package springDev.java.com;

public class HelloGender {
	
	private String gender;
	private String email;


	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void hello(String name){
		System.out.println("hello "+ gender + " from "+ name+ " , "+ email);
	}
	/*
	 * Not a valid setter. One setter, one input only.
	 */
	/*public void setGender(String gender, String email) {
		this.gender = gender;
		this.email= email;
	}*/
}
