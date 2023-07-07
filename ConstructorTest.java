
public class ConstructorTest {
	public static void main(String[] args) {
		
		Flight flightObj1 = null;
		
		try {
			flightObj1 = new Flight(-100,"Air India","Mumbai","Paris"); 
			flightObj1.showFlight();

		}
		catch(RuntimeException e) {
			System.out.println("Problem : "+e);
		}
		finally {
			System.out.println("flightObj1: "+flightObj1);

		}
		//flightObj1.setFlight(100,"Air India","Mumbai","London");
		
		/*flightObj1.flightNumber=-1000;
		flightObj1.flightName="Any Airlines";
		flightObj1.source="Zhumri";
		flightObj1.destination="Talliya";*/
		
		
		//flightObj1.setFlight(100, "Air india", "Mumbai", "Delhi");
		
		/*flightObj1.showFlight();
		
		Flight flightObj2 = new Flight(200,"Air France","Mumbai","France");
		Flight flightObj3 = new Flight(300,"Air America","Mumbai","New York");
		Flight flightObj4 = new Flight(400,"Lufthansa","Mumbai","Germany");
		Flight flightObj5 = new Flight(500,"British Airways","Mumbai","Paris");
		
		flightObj1.showFlight();
		flightObj2.showFlight();
		flightObj3.showFlight();
		flightObj4.showFlight();
		flightObj5.showFlight();
		*/
		
	}
}

class Flight
{
	private int flightNumber; //DATA
	private String flightName;
	private String source;
	private String destination;

    void fly() { 
    	System.out.println(" Flight is flying....");

    }  // FUNCTION/METHOD

    void landing() {
    	System.out.println("Flight is landing...");
    }
    //here a default constructor exists!!!!!
    //implicit no-arg constructor
    //Flight() { }
    
    Flight() { //explicit no-arg ctor
    	System.out.println("Flight() invoked...");
    }
    
    //explicit constructor
    //parameterized constructor
 /*   Flight(int i) { 
    	System.out.println("Flight(int) invoked..."+i);
    	flightNumber = i;
    }*/
    
    public Flight(int flightNumber, String flightName, String source, String destination) {

    	System.out.println("> STARTING Constructor....");
		System.out.println("Checking flight number");

		if(flightNumber < 0) {
			System.out.println("Flight Number cannot be in negative...");
			
			throw new RuntimeException("Flight Number cannot be in negative...");
			//return; //acting as completion and not termination 
		}
		else {
			System.out.println("Setting flight number....");
			this.flightNumber = flightNumber;			
		}
		
		System.out.println("Checking flight name");

		if(flightName.equalsIgnoreCase("Air India") || 
				flightName.equalsIgnoreCase("Air France") || 		
				flightName.equalsIgnoreCase("Air America") || 		
				flightName.equalsIgnoreCase("Lufthansa") || 		
				flightName.equalsIgnoreCase("British Airways")) {
			
			System.out.println("Setting flight name");

			this.flightName = flightName;
					
		}
		else {
			//System.out.println("Invalid flight Name");
			throw new RuntimeException("Invalid flight name..."); //stop the constructor here, and terminate the application
		}
		
		
		System.out.println("Checking flight source");

		if(source.equalsIgnoreCase("Mumbai")) {
			System.out.println("Setting flight source");

			this.source = source;

		}else {
			//System.out.println("Source must be Mumbai");
			throw new RuntimeException("Source must be Mumbai");
		}
		
		System.out.println("Checking flight destination");

		if(destination.equalsIgnoreCase("London") ||
				destination.equalsIgnoreCase("New York") ||
				destination.equalsIgnoreCase("Paris") ||
				destination.equalsIgnoreCase("Germany") ||
				destination.equalsIgnoreCase("New Jersey")) {
			System.out.println("Setting flight destination");

			this.destination = destination;

		} else {
			//System.out.println("Invalid flight destination....");
			throw new RuntimeException("Invalid flight destination");
			//return; // return as 0, 0 means success
		}
    	System.out.println("> FINISHING Constructor....");

    	//return 0;
	}
    
  
  
    
   /* void setFlight(int i, String j, String k, String l) { 
    	System.out.println("setFlight(int,String,String,String) invoked..."+i);
    	flightNumber = i;
    	flightName=j;
    	source=k;
    	destination=l;
    }*/
    
    //either u can have explicit or implicit ctor, but not both
    
    
    void showFlight() {
    	System.out.println("Flight Number : "+flightNumber);
    	System.out.println("Flight Name   : "+flightName);
    	System.out.println("Flight Source : "+source);
    	System.out.println("Flight Dest   : "+destination);
    	System.out.println("----------------------");
    }

	
    

}

/*
 * 
 
 	void fun() {
 		
 		
 	}
 
 * 
 */
