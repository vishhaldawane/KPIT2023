public class SyncTest {
	public static void main(String args[]) throws InterruptedException {

		Account a1 = new Account(1,"Suresh",70000f);

		Transaction t1 = new Transaction("Neeta",a1,5000); // a common object for all threads
		Transaction t2 = new Transaction("\tJulie",a1,7000);
		Transaction t3 = new Transaction("\t\tSaama",a1,8000);

		t3.start(); //invokes run() -> deposit()
		t2.start(); //invokes run() -> deposit()
		t1.start(); //invokes run() -> deposit()

		t3.join();
		t2.join();
		t1.join();
		System.out.println("FINAL BAL :"+a1.getBalance());;//90000
	}
}

class Transaction extends Thread {

   Account accObj;
   float amount;
   String tellerName;

	public Transaction(String tellerName, Account a, float amt) {
		accObj=a;
		amount = amt;
		this.tellerName = tellerName;
	}

	public void run() {
		accObj.deposit(amount,tellerName);
	}
}

class Account {

  private int accNumber;
  private String accName;
  private float bal;

	public Account(int acno, String name, float b) 	{
		accNumber = acno;
		accName = name;
		bal=b;
	}

	public float getBalance() { //AS IF A DataBase SELECT QUERY TOOK TIME TO RUN
	     try {
	    	 Thread.sleep(500);
	     }
           catch(InterruptedException e) {
	     }
	     return bal;
	}

	private void setBalance(float b) { //AS IF A DataBase UPDATE query took time to run it
	     try {
	    	 Thread.sleep(500);
	    	 bal=b;
	     } 
	     catch(InterruptedException e) {
	     }
	}

	
	//deposit method should allow only ONE thread to enter into it
	
	public   void deposit(float amt,String tn)  {

		//String threadName = Thread.currentThread().getName();
		
		//below 4 lines in asynchronous way
		System.out.println(tn+" 1--------------whatapp--------------------------");
		System.out.println(tn+" 2--------------------insta--------------------");
		System.out.println(tn+" 3------fb----------------------------------");
		System.out.println(tn+" 4---------------linkedin-------------------------");
		
		synchronized(this) {
			float temp;
			System.out.println(tn+" Getting the balance ...");
			temp = getBalance();
			System.out.println(tn+" Balance got : " + temp);
			
			temp = temp + amt;
			System.out.println(tn+" Setting the balance ...");
			
			setBalance(temp);
			System.out.println(tn+" Balance set : " + temp);
		}
		
		//System.out.println("Depositing amount by "+threadName);		
		
		//below 4 lines in asynchronous way
		System.out.println(tn+" 5-----------gmail-----------------------------");
		System.out.println(tn+" 6--------------------sms--------------------");
		System.out.println(tn+" 7--------phone--------------------------------");
		System.out.println(tn+" 8-------------------chitchat---------------------");
	}
}
