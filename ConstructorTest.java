
public class ConstructorTest {
	public static void main(String[] args) {
		Flight flightObj1 = new Flight(100,"Air India","Mumbai","London"); 
		//flightObj1.setFlight(100,"Air India","Mumbai","London");
		
		flightObj1.showFlight();
		
		//flightObj1.setFlight(100, "Air india", "Mumbai", "Delhi");
		
		flightObj1.showFlight();
		
		Flight flightObj2 = new Flight(200,"Air France","Mumbai","France");
		Flight flightObj3 = new Flight(300,"Air America","Mumbai","New York");
		Flight flightObj4 = new Flight(400,"Lufthansa","Mumbai","Germany");
		Flight flightObj5 = new Flight(500,"British Airways","Mumbai","Paris");
		
		flightObj1.showFlight();
		flightObj2.showFlight();
		flightObj3.showFlight();
		flightObj4.showFlight();
		flightObj5.showFlight();
		
		
	}
}

class Flight
{
	int flightNumber; //DATA
    String flightName;
    String source;
    String destination;

    void fly() { 
    	System.out.println(" Flight is flying....");

    }  // FUNCTION/METHOD

    void landing() {
    	System.out.println("Flight is landing...");
    }
    //here a default constructor exists!!!!!
    //implicit no-arg constructor
    //Flight() { }
    
  /*  Flight() { 
    	System.out.println("Flight() invoked...");
    }*/
    
    //explicit constructor
    //parameterized constructor
 /*   Flight(int i) { 
    	System.out.println("Flight(int) invoked..."+i);
    	flightNumber = i;
    }*/
    
    public Flight(int flightNumber, String flightName, String source, String destination) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
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
