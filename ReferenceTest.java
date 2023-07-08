
public class ReferenceTest {
	public static void main(String[] args) {
		
		Person x = new Person('M',23,"Jack");
		
		x.showPerson();
		
		Person y = x; //y is a proxy to x 
		
		System.out.println("person        : "+x);
		System.out.println("anotherPerson : "+y);
		
		x.showPerson();
		y.showPerson();
		
		System.out.println("setting age as 25 by x.setAge");
		x.setAge(25);
		
		
		x.showPerson();
		y.showPerson();
		

		System.out.println("setting age as 19 by y.setAge");
		y.setAge(19);
		
		
		x.showPerson();
		y.showPerson();

		
	}
}
