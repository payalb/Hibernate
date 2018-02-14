package com.java;

 class MyClass1 {
	
	  int x= 10;
	
	public static void main(String[] args) {
		MyClass1 obj= new MyClass1();
		obj.execute();
	}

	private  void execute() {
		Thread t= new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println(this);
				
				System.out.println(MyClass1.this.x);
				
			}
			
		});
		t.start();
	}

}
