package client;

import java_training.Employee;
import java_training.Savings;
import java_training.Account;
import java_training.Salary;
import java_training.Current;

import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.naming.OperationNotSupportedException;
import javax.security.auth.login.AccountException;
import javax.swing.text.View;
import javax.xml.transform.Source;

import java_training.Address;

public class Client {
	  public static void operate(Account account) {
		  Scanner in = new Scanner(System.in);
		  
	      boolean cont=true;
	      while(cont) {
	    	  System.out.println("Welcome: \n 1.Account Details \n 2.Account Balance \n 3.Deposit \n 4.Withdraw");
		      int choice=in.nextInt();
		  switch (choice)
		  {
		  case 1:
			  System.out.println("Account Details: ");
			  account.print();
	          break;
		  case 2:
			  System.out.println("View Account Balance");
			  System.out.println("Account Balance:"+account.getAccountBalance());
			  break;
		  case 3:
			  System.out.println("Deposit");
			  System.out.println("Enter amount:");
			  double deposit = in.nextDouble();
		      System.out.println("Account Balance:"+account.deposit(deposit));
			  break;
		  case 4:
			  System.out.println("Withdraw");
			  System.out.println("Enter amount:");
			  double amount = in.nextDouble();
			  System.out.println("Account Balance: "+account.withdraw(amount));
			  break;
		  case 5:
			  cont =false;
			  break;
		  }
	      }
	  }
      public static void main(String args[]) {
 	  Scanner in = new Scanner(System.in);

 	  List <Account> values =new ArrayList<>();
 	  boolean cnt=true;
 	  while (cnt) {
      System.out.println("1.Create 2.Account Action");
      int c=in.nextInt();
      if(c==1)
	  {System.out.println("Enter EmpId :");
	  int id = in.nextInt();
	  in.nextLine();
	  System.out.println("Enter Name:");
	  String name = in.nextLine();
	  System.out.println("Enter Salary:");
	  double salary = in.nextDouble();
	 
	  System.out.println("Enter Street:");
	  String street = in.nextLine();
	  in.nextLine();
	  System.out.println("Enter City:");
	  String city = in.nextLine();
	  System.out.println("Enter State:");
	  String state = in.nextLine();
	  Address address=new Address(street,city,state);
	  Employee keshu=new Employee (id,name,salary,address);
	  
	    System.out.println("Creating Account");
		 System.out.println("Enter Account Type: \n 0.Savings \n 1. Current \n 2.Salary");
	    int type=in.nextInt();
	    if(type==0)
		  {
	     System.out.println("Enter Initial Deposit:");
		   double bal=in.nextDouble(); 
		   Savings save = new Savings(bal, keshu);
		   System.out.println("Account Details: ");
		   values.add(save);
		   save.print();
		   
		  }
	    else if(type==1)
	    { System.out.println("Enter Initial Deposit:");
			  double bal1=in.nextDouble(); 
			  Current current = new Current(bal1, keshu);
			  System.out.println("Account Details: ");
			  values.add(current);
			  current.print();
			 
	    }	 
			  
	    else if(type==2)
	    {     System.out.println("Enter Initial Deposit:");
			   double bal2=in.nextDouble(); 
			   Salary sal= new Salary(bal2, keshu);
			   System.out.println("Account Details: ");
			   values.add(sal);
			   sal.print();
			   
	    }	 
	    else {
	    	{
	    		System.out.println("Exiting..");
	    	}
		}
	//  accountType accchoice=java_training.Account.accountType.values()[type];
	
	  }
      else
      { 
    	  System.out.println("Enter account Id: ");
    	  long accntid=in.nextLong();
    	  for(Account acc:values)
    	  {
    		  if(acc.getAccountId()==accntid)
    		  {
    			  operate(acc);
    		  }
    		  else {
    			  System.out.println("Account Doesnt Exist");
    			 
    		  }
    			  
    	  }
    	  
      }
	
	 
	//  System.out.println("Initial vacation days "+keshu.getVacationDays());
	 // keshu.applyForLeave(10);
	 // System.out.println("After Applying For Leaves: "+keshu.getVacationDays());
	 // keshu.applyForLeave(30);
     
	
	
     
  
			  }}}