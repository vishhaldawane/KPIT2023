
public class AbstractTest {
	public static void main(String[] args) {
		
		
		
		
	}
}



class Monkey
{
	void jump() {
		SavingsAccount savObj = new SavingsAccount(101,"Jack",50000,5.7f);
		//savObj.accountBalance=90000;//non-child can directly access the protected data 
	}
}
abstract class BankAccount
{
	private int accountNumber; //potential primary key 
	private String accountHolder;
	private  double accountBalance;
	
	//set the data
	BankAccount(int an, String ahn, double ab) {
		System.out.println("BankAccount....ctor...");
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
	
	
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	abstract void withdraw(double amtToWithdraw);	//MANDATE
	abstract void deposit(double amtToDeposit); //MANDATE
}

class SavingsAccount extends BankAccount //a mandate on SavingsAccount 
{
	float rate;

	public SavingsAccount(int an, String ahn, double ab, float rate) {
		super(an, ahn, ab);
		this.rate = rate;
	}
	
	void withdraw(double amtToWithdraw) {
		System.out.println("Withdrawing amount..."+amtToWithdraw);
		setAccountBalance(  getAccountBalance()-amtToWithdraw );
		
	}

	
	void deposit(double amtToDeposit) {
		System.out.println("Depositing amount..."+amtToDeposit);
		setAccountBalance(  getAccountBalance()+amtToDeposit );

	}
	
}

class FixedDepositAccount extends SavingsAccount
{
	int maturityTerm;

	public FixedDepositAccount(int an, String ahn, double ab, float rate, int maturityTerm) {
		super(an, ahn, ab, rate);
		this.maturityTerm = maturityTerm;
	}
	
}
/*

In banking !!!
	is there any account called as BankAccount???



*/