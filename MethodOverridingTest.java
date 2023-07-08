
public class MethodOverridingTest {
	public static void main(String[] args) {
	
		Doctor x = new Doctor();
		x.diagnose(); //x.Doctor.diagnose() - early binding
		
		Surgeon y = new Surgeon();
		y.diagnose(); //y.Surgeon.diagnose() - early binding
	}
}

class Doctor
{
	void diagnose() { //2b. exclusive - cum - "overridden"
		System.out.println("Doctor : checking ENT of the patient");
	}
	void chargeFees() {//3. exclusive - cum - "inherited"
		
	}
}
class Surgeon extends Doctor
{
	void diagnose() { //2a. over-riding - redefinition of the super class function signature
		System.out.println("Surgeon : checking CT/MRI Scan of the patient");
	}
	void surgery() { //1. "Exclusive"
		System.out.println("Surgeon : surgeon is doing surgery....");
	}
	//4th is "implemented" function from abstract classes/interfaces
	
}
