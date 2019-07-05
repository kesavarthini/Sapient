package java_training;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public abstract class Account implements Comparable<Account> {

	/*
	 * public enum accountType{ /SAVINGS_ACCOUNT, CURRENT_ACCOUNT, SALARY_ACCOUNT }
	 */
	private double accountBalance;
	public long accountId;
	private String name;
	private final double minAccountBalance = 3000;
	private static long accountIdHolder = 100;
	public Employee employee;
	// public accountType type;

	public Account(Employee employee) {

		// this.accountBalance=balance;
		this.accountId = ++accountIdHolder;
		this.employee = employee;
		this.employee.setAccount(this);
		// this.type=type;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
     
	 @Override
	 public boolean equals(Object obj) {
	 if(obj==null)
	 return false;
	 if(obj.getClass() != Account.class)
	 return false;
	 Account a1=(Account)obj;

	 // TODO Auto-generated method stub
	 return Objects.equals(this.accountId,a1.accountId);
	 }

	 @Override
	 public int hashCode() {
	 // TODO Auto-generated method stub
	 return Objects.hash(this.accountId);
	 }

	 @Override
	 public int compareTo(Account o) {
	 // TODO Auto-generated method stub
	 return Long.valueOf(this.accountId).compareTo(o.accountId);

	 }
	 @Override
     public String toString() {
    	 return "Account Id: "+ String.valueOf(getAccountId());
     }


	public abstract double getAccountBalance();

	public abstract void setAccountBalance(double accountBalance);

	public abstract double withdraw(double amount);

	public abstract double deposit(double amount);

	public abstract void print();
}
