import java.time.LocalDate;

public class SingleLevelTest {
	public static void main(String[] args) {
		
		/*AdhaarCard card1 = new AdhaarCard("1234 4532 6789","21,West Avenue, Mumbai 16","Julie","12-Dec-2002");
		AdhaarCard card2 = new AdhaarCard("5534 4532 6789","22,East Avenue, Mumbai 17","Jack","12-Dec-2003");
		AdhaarCard card3 = new AdhaarCard("6634 4532 6789","25,North Avenue, Mumbai 18","Smith","12-Dec-2004");
		*/
		
		
		Person anotherPerson = new Person('F',20,"Peter","1234 1234 1234","45, South AVenue","Peter Parreira","12-Dec-2002");
		anotherPerson.showPerson();
		anotherPerson.adhaarCard.showAdhaarCard();
		System.out.println("***********************");
		
 
		Person thePerson = new Person('F',23,"Julie");
		thePerson.showPerson();
		thePerson.adhaarCard.setAdhaarCard("1663 5688 9448", "Kumar Villa", "Julie Dcosta", "11-Oct-2003");

		thePerson.adhaarCard.showAdhaarCard();
		System.out.println("***********************");

		
		Student theStudent = new Student('M',25,"Jack",123,"EXTC",90,'A');
		theStudent.showStudent();
		theStudent.adhaarCard.setAdhaarCard("1233 5678 9988", "Ram Manzil", "Jack Dsouza", "12-Oct-2002");
		theStudent.adhaarCard.showAdhaarCard();
		System.out.println("***********************");
	
		//Employee theEmployee = new Employee('F',24,"Reeta",345,"BTech",97,'A',7839,"Analyst",12000);
		Employee theEmployee = new Employee('M',"Smith",20000,"CEO");		
		theEmployee.showEmployee();
		theEmployee.adhaarCard.setAdhaarCard("4533 6678 9988", "Rahim Niwas", "Smith Dmello", "11-Sep-2002");
		
		theEmployee.adhaarCard.showAdhaarCard();
	}
}

class AdhaarCard
{
	String adhaarNumber;
	String address;
	String nameOnAdhaar;
	String birthdate;
	
	AdhaarCard() {
		
	}
	
	public AdhaarCard(String adhaarNumber, String address, String nameOnAdhaar, String birthdate) {
		super();
		this.adhaarNumber = adhaarNumber;
		this.address = address;
		this.nameOnAdhaar = nameOnAdhaar;
		this.birthdate = birthdate;
	}
	
	public void setAdhaarCard(String adhaarNumber, String address, String nameOnAdhaar, String birthdate) {
		this.adhaarNumber = adhaarNumber;
		this.address = address;
		this.nameOnAdhaar = nameOnAdhaar;
		this.birthdate = birthdate;
	}
	void showAdhaarCard() {
		System.out.println("--ADHAAR DETAILS--");
		System.out.println("ADHAAR NUMBER : "+adhaarNumber);
		System.out.println("ADDRESS       : "+address);
		System.out.println("NAME ON ADHAR : "+nameOnAdhaar);
		System.out.println("BIRTHDATE     : "+birthdate);
		System.out.println("-----------------");
	}
	
}

class Person // can we say -  isA Person a Student?
{
	 private char gender;
	 private int age;
	 private String name;
	 AdhaarCard adhaarCard; //just a reference to it
	 
	//Person() { }
	 		//<---------Personal-----------><------------hasA ------------------------------------------------>
	Person(char gender, int age, String name,String adhaarNum, String address, String nameOnAdhaar, String dob  ) {
		this.gender = gender;
		this.age = age;
		this.name = name;
		adhaarCard = new AdhaarCard(name, adhaarNum, address, dob); //instance creation process is taken care
	}
	public Person(char gender, int age, String name) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
		adhaarCard = new AdhaarCard();
	}
	
	void showPerson() { //Exclusive - cum - Inherited method 
		System.out.println("--PERSONAL INFO--");
		System.out.println("Gender : "+gender);
		System.out.println("Age    : "+age);
		System.out.println("Name   : "+name);
		System.out.println("-----------------");
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
class Student extends Person //A Student isA Person
{
	int rollNumber;
	String stream;
	float marks;
	char grade;
	
	
	Student(char gender, int age, String name) {
		super(gender,age,name); //invoking nearest super class's constructor
	}


	public Student(char gender, int age, String name, int rollNumber, String stream, float marks, char grade) {
		super(gender, age, name); //re-usability of the super class's code
		this.rollNumber = rollNumber;
		this.stream = stream;
		this.marks = marks;
		this.grade = grade;
	}
	
	void showStudent() {
		super.showPerson(); //invoke nearest super class's function
		System.out.println("--STUDENT INFO--");
		System.out.println("ROLLNO : "+rollNumber);
		System.out.println("STREAM : "+stream);
		System.out.println("MARKS  : "+marks);
		System.out.println("GRADE  : "+grade);
		System.out.println("-----------------");	}
}
//-----multi level below

class Employee extends Student  //A Employee isA Student
{
	int employeeNumber;
	String designation;
	float salary;
	

	//10 parameterized 
	public Employee(char gender, int age, String name, int rollNumber, String stream, float marks, char grade,
			int employeeNumber, String designation, float salary) {
		super(gender, age, name, rollNumber, stream, marks, grade);
		this.employeeNumber = employeeNumber;
		this.designation = designation;
		this.salary = salary;
	}

	//4 parameterized
	Employee(char gender, String name, float salary, String desg) { //smith joining salary  20000 ceo 
		this(gender,0,name,0,"",0,' ',0,desg,salary); //invoking the 10 paramerized
	}

	void showEmployee() {
		super.showStudent(); //invoke nearest super class's function
		System.out.println("--EMPLOYEE INFO--");
		System.out.println("EMPNO   : "+employeeNumber);
		System.out.println("DESG    : "+designation);
		System.out.println("SALARY  : "+salary);
		System.out.println("-----------------");	}
}





