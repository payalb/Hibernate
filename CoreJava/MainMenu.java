package com.java.test;

import com.java.test.TicketClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
	ArrayList<Ticket> ticketList = new ArrayList<Ticket>();
	TicketClass tc ;
	HashMap<String,TicketClass> ticketHash = new HashMap<String,TicketClass>();
	public static void main(String[] args) {
		MainMenu mainMenu = new MainMenu();
		mainMenu.openMenu();
		
	}
	public void openMenu() throws InputMismatchException{
		System.out.println("########################################");
		System.out.println("***********Railway Reservation Menu**************");
		System.out.println("########################################");
		System.out.println("1.Book Ticket");
		System.out.println("2.Cancel Ticket");
		System.out.println("3.Get Ticket Details");
		System.out.println("4.Reservation Chart");
		System.out.println("5.Display Unbooked Tickets");
		System.out.println("6.Exit");
		System.out.println("Please Enter Your choice");
		tc = new TicketClass();
		Scanner sc = new Scanner(System.in);
		int selected = sc.nextInt();
		optionSelected(selected);
	}
	public void optionSelected(int i) {
		switch(i) {
			case 1 :
				bookTicket();
				break;
			case 2: 
				cancelTicket();
				break;
			case 3 :
				getTicketdetails();
				break;
			case 4 :
				reservationChart();
				break;
			case 5:
				displayUnbookedTickets();
				break;
			case 6:
				System.exit(1);
				break;
			default:
				System.out.println("Wrong choice entered");
				openMenu();
				
		}
				
	}
	public void bookTicket() {
		try {
		ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1001; i<9999; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
		System.out.println("Enter the class of the Ticket");
		System.out.println("1.First Class       2.Second Class         3.Sleeper");
		System.out.println("**Enter the whole string**");
		System.out.println("for eg : \"first class\" for First Class");
		System.out.println("for eg : \"second class\" for Second Class");
		System.out.println("for eg : \"sleeper class\" for Sleeper Class");
		Scanner sc = new Scanner(System.in);
		String ticketClass = sc.nextLine();
		System.out.println("Enter Number Of  Tickets");
		int noOfTickets = sc.nextInt();
		int i = 0;
		ticketList = new ArrayList<Ticket>();
		while(i<noOfTickets) {
			System.out.println("Enter Details of the Passeneger "+ ++i);
			Ticket t = new Ticket();
			
			System.out.println("Enter Name of the Passenger");
			String name = sc.next();
			System.out.println("Enter Age");
			int age = sc.nextInt();
			System.out.println("Enter Phone Number");
			String phoneNo = sc.next();
			if(isValid(name,age,phoneNo)) {
				t.setName(name);
				t.setAge(age);
				t.setPhoneNo(phoneNo);
				//t.setTicketClass(ticketClass);
				//System.out.println("Correct");
				
				ticketList.add(t);
				
				//System.out.println(t.getTransactionId());
			
			}
			else {
				System.out.println("Invalid Details");
				i--;
			}
		}
		tc.setTicketListArray(ticketList);
		tc.setTransactionId((String) list.get(i).toString()) ;
		tc.setTicketClass(ticketClass);
		tc.setStatus("Confirmed");
		System.out.println("Trasaction Id : "+tc.getTransactionId());
		System.out.println("Ticket Successfully Booked");
		ticketHash.put(tc.getTransactionId(),tc);
		payment(tc);
		}catch(InputMismatchException e) {
			System.out.println("Enter the details in correct format");
			openMenu();
		}
	}
	public boolean isValid(String name,int age,String phoneNo) {
		boolean valid = true;
		if (!name.matches("[a-zA-Z]+")) {
			valid = false;
		}
		else if (age<0 || age>150) {
			valid = false;
		}
		else if(phoneNo.length() > 13) {
			valid = false;
		}
		return valid;
		
	}
	public void payment(TicketClass tc) {
		int price = 0;
		if(tc.getTicketClass().equalsIgnoreCase("first class")) {
			price = 2000 * ticketList.size();
			tc.firstclassCount = tc.firstclassCount - ticketList.size();
		}
		else if(tc.getTicketClass().equalsIgnoreCase("second class")) {
			price = 1500 * ticketList.size();
			tc.secondclassCount = tc.secondclassCount - ticketList.size();

		}
		else if(tc.getTicketClass().equalsIgnoreCase("sleeper class")) {
			price = 1000*ticketList.size();
			tc.sleeperclassCount = tc.sleeperclassCount - ticketList.size();

		}
		System.out.println("Pay : "+price);
		if(new Scanner(System.in).nextInt() != price) {
			System.out.println("Please pay the exact amount");
			payment(tc);
		}
		else {
			 System.out.println("Thanks");
			 tc.setPrice(price);
			 openMenu();
		}
	}
	public void cancelTicket() {
			
		
		System.out.println("Enter the Transaction Id");
		Scanner sc = new Scanner(System.in);
		String transactionId = sc.next();
		if(ticketHash.get(transactionId)!=null) {
			TicketClass tc= ticketHash.get(transactionId);
			int price = tc.getPrice();
			synchronized (this) {
				tc.setStatus("Cancelled");
			}
			System.out.println(price + " would be refunded in your account");
			openMenu();
		}
		else {
			System.out.println("No Tickets Found");
			//cancelTicket();
			openMenu();
		}
	}
	public void getTicketdetails() {
		System.out.println("Enter the Transaction Id");
		Scanner sc = new Scanner(System.in);
		String transactionId = sc.next();
		if(ticketHash.get(transactionId)!=null) {
			TicketClass tc= ticketHash.get(transactionId);
			System.out.println("Number of tickets Booked : "+tc.getTicketListArray().size());
			ArrayList<Ticket> al = tc.getTicketListArray();
			for(int i = 0;i<al.size();i++) {
				System.out.println("Passenger : "+(i+1));
				Ticket t = new Ticket();
				t = al.get(i);
				System.out.println("Name : "+t.getName());
				System.out.println("Age : "+t.getAge());
				System.out.println("Phone Number : "+t.getPhoneNo());
			}
			System.out.println("Ticket class : "+tc.getTicketClass());
			System.out.println("Amount Paid : "+tc.getPrice());
			System.out.println("Staus : "+tc.getStatus());
			openMenu();
		}
		else {
			System.out.println("No Tickets Found");
			//cancelTicket();
			openMenu();
		}
	}
	public void reservationChart() {
		ArrayList<Ticket> al = new ArrayList<Ticket>();
		for(String s : ticketHash.keySet()) {
			TicketClass tc = ticketHash.get(s);
			{
				if(tc.getTicketClass().equalsIgnoreCase("first class")) {
					System.out.println("******Passenger List in First class : *********");
					 al = tc.getTicketListArray();
					 for(Ticket t :al) {
						 System.out.println("Name : "+t.getName());
						 System.out.println("Age :"+t.getAge());
						 System.out.println("Phone Number : "+t.getPhoneNo());
					 }
				}
				else if(tc.getTicketClass().equalsIgnoreCase("second class")) {
					System.out.println("***********Passenger List in Second class : **********");
					 al = tc.getTicketListArray();
					 for(Ticket t :al) {
						 System.out.println("Name : "+t.getName());
						 System.out.println("Age :"+t.getAge());
						 System.out.println("Phone Number : "+t.getPhoneNo());
					 }
				}
				else if(tc.getTicketClass().equalsIgnoreCase("sleeper class")) {
					System.out.println("**********Passenger List in Sleeper class : *******");
					 al = tc.getTicketListArray();
					 for(Ticket t :al) {
						 System.out.println("Name : "+t.getName());
						 System.out.println("Age :"+t.getAge());
						 System.out.println("Phone Number : "+t.getPhoneNo());
					 }
				}
			}
		}
		openMenu();
	}
	public void displayUnbookedTickets() {
		synchronized (this) {
		System.out.println("No of seats in First Class : " + tc.firstclassCount);
		System.out.println("No of seats in Second Class : " + tc.secondclassCount);
		System.out.println("No of seats in Sleeper Class : " + tc.sleeperclassCount);
		}
		openMenu();
	}
}
