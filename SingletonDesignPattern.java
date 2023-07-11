
public class SingletonDesignPattern {
	public static void main(String[] args) {
		
		Kitchen kitchen1 = Kitchen.getInstance();
		Kitchen kitchen2 = Kitchen.getInstance();
		Kitchen kitchen3 = Kitchen.getInstance();
		
		System.out.println("kitchen1 : "+kitchen1.hashCode());
		System.out.println("kitchen2 : "+kitchen2.hashCode());
		System.out.println("kitchen3 : "+kitchen3.hashCode());

	}
}
//Design pattern is not "Algorithm or Business logic"
//it is a way of achieving a solution in a particular manner


//batting is a business logic - to score runs

// Pattern of behaviour of batting of Saurav Ganguly


class Kitchen
{
	static Kitchen kitchenRef;// = new Kitchen() ; //single copy - created once
	
	private Kitchen() {
		System.out.println("Kitchen ctor().....");
	}
	
	public static Kitchen getInstance() {
		if(kitchenRef == null)
			kitchenRef = new Kitchen(); //can it access private ctor
		
		return kitchenRef;
	}
}
