
public class PhoneTest {
	public static void main(String[] args) {
		
		Phone myPhone = new Phone();
		myPhone.dial();
		
		byte intercomm = 100;//min -128  0   max is 127 
		myPhone.dial(intercomm); //myPhone.Phone.dial(byte)
		
		//myPhone.Phone.dial(String) <- internal mangling
		myPhone.dial("Seema");// compile time binding | early binding
	
		
		byte speedDial1=1;
		byte speedDial2=2;
		
		myPhone.dial(speedDial1,speedDial2);
		
		myPhone.dial(speedDial1, "Jack");
		
		myPhone.dial("Jane", speedDial2);
		
	}
}


class Phone
{
	void dial() {
		System.out.println("dial() : dialing ... nowhere...");
	}
	void dial(byte number) { //number of arg is 1, but type is diff
		System.out.println("dial(int): dialing...."+number);
	}
	void dial(byte num1, byte num2) { //type of arg is same, but count is 2 
		System.out.println("dial(byte,byte) : dialing a conference : "+num1 + " with "+num2);
	}
	void dial(String name) { //number of arg is 1, but type is diff
		System.out.println("dial(String) : dialing...."+name);

	}
	
	void dial(byte num1, String name) { //number of arguments 2, type is diff
		System.out.println("dial(byte,String) : dialing a conference : "+num1 + " with "+name);
	}
	
	void dial( String name,byte num1) { //number of arguments 2, type is diff, but sequence is changed
		System.out.println("dial(String,byte) : dialing a conference : "+name + " with "+num1);
	}
}
