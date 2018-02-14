package com.java.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;


/*
public class One {
	public static void main(String args[]) throws Exception {
		  int i;
          try{
                i = calculate();
                System.out.println(i);
          }catch(Exception e){
                System.out.println("Error occured");
          }
       //   System.out.println(i);
    }

    static int calculate(){
          return (7/2);
    }

public static void add(){
	Scanner sc=null;
	try{
		sc= new Scanner(new FileReader("abc1.txt"));
		
		PrintWriter writer= new PrintWriter(System.out);
		writer.println(sc.next());
		
	}
catch(FileNotFoundException e){
		throw new RuntimeException("abc.txt not found!!");
	}catch(IOException e){
		throw new MyException("Error doing input output!!");
	}finally{
		if(sc!=null)
		sc.close();
	}
	
}
}
*/


class A{
    public void printName() throws IOException, NullPointerException{
          System.out.println("Value-A");
    }
}
class B extends A{
    public void printName() throws FileNotFoundException, RuntimeException{
          System.out.println("Name-B");
    }
}
public class One{
    public static void main (String[] args) throws Exception{
          A a = new B();
          a.printName();
    }
}