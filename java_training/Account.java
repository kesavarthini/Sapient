package java_training;
public class Account {

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
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public double withdraw(double amount) {
		if((this.accountBalance-amount)>=minAccountBalance){
			this.accountBalance-=amount;
			return accountBalance;
		}else {
			System.out.println("Insufficient Balance!!!");
			System.out.println("Current Account Balance:"+this.accountBalance+"\nMinimum Balance:3000");
			return this.accountBalance;
		}
			
	}
	public double deposit (double amount)
	{
		this.accountBalance=accountBalance+amount;
		return this.accountBalance;
	}
	public void print() {
		
		System.out.println("AccountId = " +this.accountId);
		System.out.print("Employee Name = "+this.employee.getName());
		System.out.println("\nAccountBalance ="+this.accountBalance);
	
		
	}
}
