
public class SingleLevel {
	public static void main(String[] args) {

		GrandFather grandFather = new GrandFather();
		grandFather.farming();
		grandFather.age=75;

		System.out.println("-------");
		
		Father father = new Father();
		father.farming();
		father.age=50;
		
		
		System.out.println("-------");

		Child child = new Child();
		child.farming();
		child.age=20;
		

		System.out.println("grand father's age "+grandFather.age);
		System.out.println("father's age "+father.age);
		System.out.println("child's age "+child.age);

		//grandFather.salary=9000;
		father.salary=9000;
		
		child.salary=5000;
		child.marks=90;
	
	}
}

class GrandFather // extends Object [ java.lang ] 
{
	int age;
	
	GrandFather() {
		super();
		System.out.println("GrandFather ctor...");
	}
	void farming() {
		System.out.println("GrandFather is farming in a traditional way..via ..plough and harrow...");
	}
}

class Father extends GrandFather
{
	//int age is inherited declaration here now
	
	int salary;
	
	Father() {
		super(); //hidden first line of every constructor
		System.out.println("\tFather ctor...");
	}
	void farming() {
		System.out.println("Father is farming in a new way..via ..tractor ...");
	}
}

class Child extends Father
{
	int marks;
	
	Child() {
		super();
		System.out.println("\t\tChild ctor...");
	}
	void farming() {
		System.out.println("Child is farming in a modern way..via ..robotic tractor ...");
	}
}

