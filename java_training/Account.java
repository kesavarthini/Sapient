package java_training;
public abstract class Account {

	/*public enum accountType{
		/SAVINGS_ACCOUNT,
		CURRENT_ACCOUNT,
		SALARY_ACCOUNT
	}*/
	private double accountBalance;
	public long accountId;
	private String name;

	private final double minAccountBalance=3000;
	private static long accountIdHolder=100;
	public Employee employee;
	//public accountType type;
	
	
	
	public Account (Employee employee) {
		
		//this.accountBalance=balance;
		this.accountId = ++accountIdHolder;
		this.employee=employee;
		this.employee.setAccount(this);
		//this.type=type;
	}
	public  abstract long getAccountId();
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract double getAccountBalance();
	public abstract void setAccountBalance(double accountBalance) ;
	
	public abstract double withdraw(double amount);
	public abstract double deposit (double amount);
	public abstract void print() ;
}
