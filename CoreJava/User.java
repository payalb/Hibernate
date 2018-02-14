
public  class  User  {
    private String name []=new String[200];
    private  int [] age=new int[200];
    private int[] phone_number =new int[200];
//    public int tid []=new int[30];
//    private int id;
    public User()
    {
    	
    }

    public void display(){
    	System.out.println("Name:"+" "+this.name);
    	System.out.println("Age of passenger:"+" "+this.name);
    	System.out.println("phone number of passenger:"+" "+this.name);
    }
	public String[] getName() {
		return name;
	}
	public void setName(String[] name) {
		this.name = name;
	}
	public int[] getAge() {
		return age;
	}
	public void setAge (int[] age) {
		this.age = age;
	}
	public int[] getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int[] phone_number) {
		this.phone_number = phone_number;
	}


    
}
