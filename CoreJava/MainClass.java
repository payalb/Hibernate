import java.io.IOException;
import java.util.Scanner;


public class MainClass {

	  public static void main(String args[]) throws NumberFormatException, IOException{
		
		  User u1=new User();
		  Tickets t1=new Tickets(u1);
		
		
		int ch;
		do{
		  System.out.println("############################################");
		  System.out.println("Railway Reservation Menu ");
		  System.out.println("############################################");
		  System.out.println("1.Book ticket");
		  System.out.println("2.Cancel ticket");
		  System.out.println("3.Get ticket Deatails");
		  System.out.println("4.Reservation chart");
		  System.out.println("5.Display unbooked tickets");
		  System.out.println("6.Exit");
		  System.out.println("Please enter your choice");
		  Scanner sc=new Scanner(System.in);
		   ch=sc.nextInt();
		  switch(ch)
          {
	      case 1:t1.doBook();
	            break;
	      case 2:t1.doCancel();
	            break;
	      case 3:t1.Details();
	            break;
//	      case 4:doDispList();
//	            break;
        case 5:t1.Unbooked();
                  break;
        case 6:t1.Exit();
              break;
	  
	      default :System.out.println("Exit..");
	      break;
	      }
		  }while(ch!=6);
		  

	  }
	 
}
