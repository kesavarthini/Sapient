package java_training;

import java.util.Objects;

public class Employee{

	private int id;
	private String name;
	private double salary;
	private int vacationDays = 30;
	public Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Address address;

	/*
	 * public Employee (int id,String name,double salary,SavingsAccount
	 * account,Address address) { this.id=id; this.name=name; this.salary=salary;
	 * this.account=account; this.address=address; }
	 */
	public Employee(int id, String name, double salary, Address address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;

	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	public void applyForLeave(int noOfDays) {
		if (vacationDays >= noOfDays) {
			vacationDays -= noOfDays;

		} else {
			System.out.println("You do not have sufficient leave balance to apply");
		}
	}

	public void print() {
		if (account == null) {
			System.out.println("\nEmp Name:" + this.name);
			address.Address();
		} else {
			System.out.println("\nEmp Name:" + this.name);
			address.Address();
		}
	}

}
