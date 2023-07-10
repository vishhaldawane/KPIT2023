//Demonstrate thread priorities

class Clicker  implements Runnable {

	long click = 0; //to increment
	
	Thread t; //handle for Thread class
	
	private volatile boolean running = true; //check if it is running or not

		public Clicker(int p)		{ //p is the priority value 1 , 5 or 10
			t = new Thread(this); //runnable object is passed, Clicker
			t.setPriority(p);//set the priority
		}

		public void run()		// the logic goes here
		{
			while(running) 	//infinite loop , since it is TRUE	
			{
				click++; // infinitely increment click
			}
		}

		public void stop()  {
			running=false; //STOP the loop, if it is FALSE
		}

		public void start() { //it is of Clicker, and not of Thread
			t.start(); // the actual start() of Thread, invokes your run()
		}
}

public class HiLoPri			{
	public static void main(String[] args) 	{

		//Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Clicker hi = new Clicker(Thread.MAX_PRIORITY);//10
		Clicker lo = new Clicker(Thread.MIN_PRIORITY);//1

		lo.start();
		hi.start();
		System.out.println("started......");

		try		{
			Thread.sleep(7000);
			System.out.println("10 seconds over....");
		}
		catch (InterruptedException e) 		{
				System.out.println("Main thread interrupted");
		}
		
		System.out.println("trying to stop them...");
		lo.stop();
		hi.stop();
		System.out.println("stopped them...");

		//wait for child threads to terminate
		try		{
					System.out.println("waiting for their join method to get over");

					   hi.t.join();
					   lo.t.join();
					   System.out.println("are they really stopped???");
		}
		catch (InterruptedException e)		{
				System.out.println("InterruptedException caught");
		}

				System.out.println("Low-priority thread :  "+lo.click);
				System.out.println("Hi-priority thread  :  "+hi.click);
	}
}
// lo = 32678065
//hi = 1613291673

