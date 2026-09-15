package com.client;

import java.util.List;
import java.util.Scanner;

import com.aspectProvider.ObjectProvider;
import com.bean.Account;
import com.services.AccountServices;

public class ClientCode {

	public static void main(String[] args) 
	{
		 AccountServices service = ObjectProvider.createAccServiceObject();

		 Scanner sc = new Scanner(System.in);
		 
		 int choice;
		 
		 do
			 {
			    System.out.println("\n====== BANK MANAGEMENT SYSTEM ======");
			    System.out.println("1. Open Account");
			    System.out.println("2. Balance Enquiry");
			    System.out.println("3. Deposit");
			    System.out.println("4. Withdraw");
			    System.out.println("5. Print Account Details");
			    System.out.println("6. Display All Accounts");
			    System.out.println("7. Transfer");
			    System.out.println("8. Exit");
			    System.out.println("\n");
			    
			    System.out.println("Enter your choice :");
			     choice = sc.nextInt();
			     
			     
			     switch(choice )
			     {
			     case 1:
			    	 
			    	 sc.nextLine();
			    	 
			    	 System.out.println("\n Enter Account Type :");
			    	 String accType= sc.nextLine();
			    	 
			    	 System.out.println("Enter amount");
			    	 float amount=sc.nextFloat();
			    	 
			    	int accNo= service.openAccount(accType, amount);
			    	System.out.println("Account open successfully!");
			    	System.out.println("Account Number :"+accNo);
			     
			    	break;
			    	
			     case 2:
			    	 
			    	 System.out.println("Enter Account No :");
			    	 int no= sc.nextInt();
			    	 
			    	 float balance= service.balEnquiery(no);
			    	 
			    	 if(balance != 0)
			    		 System.out.println("Balance : " + balance);
			    	 else
			     		 System.out.println("Account not found ");
			    	 break;
			    	 
			      case 3:
			    	  
			    	  System.out.println("Enter Account No : ");
			    	  int depoNo=sc.nextInt();
			    	  
			    	  System.out.println("Enter Amount to deposit : ");
			    	  float depoAmt= sc.nextFloat();
			    	  
			    	  float newBal = service.deposit(depoNo, depoAmt);
			    	  
			    	  if(newBal !=0)
			    		  System.out.println("Updated Balance : " + newBal);
			    	  else
			    		  System.out.println("Account not found");
			    	  break;
			    	  
			    	 
			      case 4:
			    	  
			    	  System.out.println("Enter Account No : ");
			    	  int withNo = sc.nextInt();
			    	  
			    	  System.out.println("Enter Withdraw amount : ");
			    	  float withAmt=sc.nextFloat();
			    	  
			    	  service.withdraw(withNo, withAmt);
			    	  
			    	  break;
			    	  
			      case 5:
			    	  
			    	  System.out.println("Enter Account No : ");
			    	  int printNo=sc.nextInt();
			    	  
			    	  String details = service.printAccountDetails(printNo);
			    	  System.out.println(details);
			    	  
			    	  break;
			    	  
			      case 6:
			    	  
			    	  List<Account> list = service.displayAllAccount();
			    	  
			    	  if(list.isEmpty())
			    	  {
			    		  System.out.println("Account not found");
			    	  }
			    	  else
			    	  {
			    		  for(Account a: list)
			    		  {
			    			  System.out.println(a);
			    		  }
			    	  }
			    	  
			    	  break;
			    	  
			      case 7:
			    	  
			    	  System.out.println("Enter Sender Account No   : ");
			    	  int senderNo = sc.nextInt();
			    	  
			    	  System.out.println("Enter Receiver Account No : ");
			    	  int receiverNo= sc.nextInt();
			    	  
			    	  System.out.println("Enter Amount : ");
			    	  float amt=sc.nextFloat();
			    	  
			    	  service.transfer(senderNo, receiverNo, amt);
			    	  
			    	  break;
			    	  
			    	  
			      case 8: 
			    	  System.out.println("Exit");
			    	  
			    	  break;
			    	 
			    	 default :
			    		 System.out.println("Invalid choice");
			     }
			     
			 }  
		       while(choice !=8);
		       sc.close();
	}

}
