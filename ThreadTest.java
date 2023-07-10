
public class ThreadTest {
	public static void main(String[] args) {
		//3. create the objects of your thread class
		Car myCar1 = new Car("Swift");
		Train myTrain = new Train("\tChennai Express");
		Car myCar3 = new Car("\t\tKIA");
		
		//4. never call run, rather 
		//call its start() method, which invokes the run()
		myCar3.start();//will invoke run()
		myTrain.start();//will invoke run()
		myCar1.start();//will invoke run();
		
				
	}
}

//1. extend from java.lang.Thread class
class Car extends Thread {
	
	String model;
	
	Car(String model) {
		System.out.println("Car() constructed...");
		this.model = model;
	}
	//2. override its run method
	public void run() {
		//put your logic here, that participates in threading
		for (int i = 0; i < 100; i++) {
			System.out.println(model+" Car is running..."+i);
		}
	}
}

class Train extends Thread {
	
	String model;
	
	Train(String model) {
		System.out.println("Train() constructed...");
		this.model = model;
	}
	//2. override its run method
	public void run() {
		//put your logic here, that participates in threading
		for (int i = 0; i < 200; i++) {
			System.out.println(model+" Train is running..."+i);
		}
	}
}
