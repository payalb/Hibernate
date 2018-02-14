import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//import User.java;

public class Tickets {
	User u1;
	Tickets(){
		
	}
	Tickets(User u1){
		this.u1=u1;
	}
	 private String name []=new String[200];
	    private  int [] age=new int[200];
	    private int[] phone_number =new int[200];
  int class1ticket=75;
  int class2ticket=150;
  int class3ticket=200;
  int cost1=2000;
  int cost2=1500;
  int cost3=1000;
  int pnum=111;
  int pcount=0;
  int cl []=new int[5000];
  int temp;
static  int  transaction_id[]=new int[500];
  public void doBook() throws NumberFormatException, IOException{
	  synchronized(this){
	  InputStreamReader isr=new InputStreamReader (System.in);
	  BufferedReader br=new BufferedReader (isr);
	   int c=0,t,tick;
	   System.out.println("Enter class of your ticket  1.First Class    2.Second Class    3.Sleeper");
	   Scanner sc=new Scanner(System.in);
	   c=sc.nextInt();
	   System.out.println("Enter number of tickets");
	   t=sc.nextInt();
	   tick=t;
	   if(c==1&&t<=class1ticket){
		   System.out.println("tickets available");
	   }
	   if(c==2&&t<=class2ticket){
		   System.out.println("tickets available");
	   }
	   if(c==3&&t<=class3ticket){
		   System.out.println("tickets available");
	   }
	   int m=1;
	   while(t!=0){
		   System.out.println("Please enter details of passenger "+t);
		   System.out.println("Please enter your name");
		   name[pcount]=br.readLine();
//		   u1.setName(name[pcount]);
		   System.out.println("Please enter your age");
		   age[pcount]=Integer.parseInt(br.readLine());
		   u1.setAge(age);
		   System.out.println("Please enter your phone number");
		   phone_number[pcount]=Integer.parseInt(br.readLine()); 
		   pcount++;
		   if(t==1){
//			   u1.settid(pnum);
			   transaction_id[pcount]=pnum++;
			   cl[pcount]=c;
			 
			   System.out.println("TRANSACTION ID:"+pnum);
		   }
		   t--;
		   
		  }
	   System.out.println("Ticket successfully Booked!!");
	   System.out.println("TRANSACTION ID:"+pnum);
	     if(c==1){
	    	 class1ticket-=1;
	    	 System.out.println("please pay:"+" "+2000*tick);
	     }
	     if(c==2){
	    	 class2ticket-=1;
	    	 System.out.println("please pay:"+" "+1500*tick);
	     }
	     if(c==3){
	    	 class2ticket-=1;
	    	 System.out.println("please pay:"+" "+1000*tick);
	     }
	  }
   }
  public void doCancel(){
	  synchronized(this){
	  System.out.println("Enter your transaction id");
	  int td;
	  int i=0;
	  System.out.println("Enter transaction id");
	  Scanner sc =new Scanner(System.in);
	  td=sc.nextInt();
	  for(int j=0;j<pcount;j++)
	  {
		  if(j==1)
		  {
			  System.out.println("Booking Cancelled");
			  System.out.println("Rs 2000 will be added to your account within 2 working days!!");
		  }
		  if(j==2)
		  {
			  System.out.println("Booking Cancelled");
			  System.out.println("Rs 1500 will be added to your account within 2 working days!!");
		  }
		  if(j==3)
		  {
			  System.out.println("Booking Cancelled");
			  System.out.println("Rs 1000 will be added to your account within 2 working days!!");
		  }
	  }
	  }
	 }
  public void Details(){
	  int td;
	  System.out.println("Enter transaction id");
	  Scanner sc =new Scanner(System.in);
	  td=sc.nextInt();
	  for(int i=0;i<pcount;i++){
		  if(transaction_id[i]==td){
			  System.out.println("name of passenger"+name[i]);
			  System.out.println("Age of passenger"+age[i]);
			  System.out.println("name of passenger"+phone_number[i]);
		  }
	  }
  }
  public void Unbooked(){
	  System.out.println("Number of tickets left in fiest class"+class1ticket);
	  System.out.println("Number of tickets left in fiest class"+class2ticket);
	  System.out.println("Number of tickets left in fiest class"+class3ticket);
  }
  
  public void Exit(){
	  System.out.println("Thank you!!");
	  System.exit(0);
  }
}
