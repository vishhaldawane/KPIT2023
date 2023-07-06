
public class SavingsAccountTest { //TESTER CLASS
	public static void main(String[] args) {
		System.out.println("Hello STS");
		SavingsAccount savObj1 = new SavingsAccount();
		savObj1.showSavingsAccount();
		savObj1.setSavingsAccount(101, "Smith", 5000);
		savObj1.showSavingsAccount();
		
		savObj1.withdraw(2000);
		savObj1.showSavingsAccount();
		savObj1.deposit(12000);
		savObj1.showSavingsAccount();
	}
}

class SavingsAccount { //ACTUAL BUSSINESS ENTITY
	
	private int accountNumber; //potential primary key 
	private String accountHolder;
	private double accountBalance;
	
	//set the data
	void setSavingsAccount(int an, String ahn, double ab) {
		System.out.println("Setting the SavingsAccount....");
		accountNumber = an;
		accountHolder = ahn;
		accountBalance = ab;
	}
	void showSavingsAccount() {
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Holder  : "+accountHolder);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("--------------------------------");
	}
	void withdraw(double amtToWithdraw) {
		System.out.println("Withdrawing amount..."+amtToWithdraw);
		accountBalance -= amtToWithdraw;
	}
	void deposit(double amtToDeposit) {
		System.out.println("Depositing amount..."+amtToDeposit);
		accountBalance += amtToDeposit;
	}
	
}