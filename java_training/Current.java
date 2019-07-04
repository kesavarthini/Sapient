package java_training;

public class Current extends Account{

	private final double minAccountBalance=5000;
	private final double withdrawal_limit=20000;
	private final double deposit_limit=200000;
	double accountBalance;
	public Current(Double balance,Employee employee){
		  super(employee);
		  this.accountBalance=balance;
		 
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
		
		System.out.println("AccountId = " +super.accountId);
		System.out.println("AccountType = Current");
		System.out.print("Employee Name = "+this.employee.getName());
		System.out.println("\nAccountBalance ="+this.accountBalance);
	
		
	}

}
