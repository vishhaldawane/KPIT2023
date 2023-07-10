
public class ThreadTest {
	public static void main(String[] args) {
		//3. create the objects of your thread class
		Car myCar1 = new Car("Swift");
		Train myTrain = new Train("\tChennai Express");
		Car myCar3 = new Car("\t\tKIA");
		
		//4. Create the object of java.lang.Thread class 
		//and pass the Runnable object in it's constructor
		
		Thread t1 = new Thread(myCar1);
		Thread t2 = new Thread(myTrain);
		Thread t3 = new Thread(myCar3);
		
		//5. never call run, rather 
		//call t1's start() method, which invokes Runnable's run()
		
		t1.start();//will invoke myCar1's run()
		t2.start();//will invoke myTrain's run()
		t3.start();//will invoke myCar3's run();
		
				
	}
}

class Vehicle {
	
}

//1. implements from java.lang.Runnable interface
class Car extends Vehicle implements Runnable {
	
	String model;
	
	Car(String model) {
		System.out.println("Car() constructed...");
		this.model = model;
	}
	//2. mandate to implement run method
	public void run() {
		//put your logic here, that participates in threading
		for (int i = 0; i < 100; i++) {
			System.out.println(model+" Car is running..."+i);
		}
	}
}

class Train extends Vehicle implements Runnable {
	
	String model;
	
	Train(String model) {
		System.out.println("Train() constructed...");
		this.model = model;
	}
	//2. mandate
	public void run() {
		//put your logic here, that participates in threading
		for (int i = 0; i < 200; i++) {
			System.out.println(model+" Train is running..."+i);
		}
	}
}
