
public class SingleLevelTest {
	public static void main(String[] args) {
		Person thePerson = new Person('F',23,"Julie");
		thePerson.showPerson();
		System.out.println("***********************");

		
		Student theStudent = new Student('M',25,"Jack",123,"EXTC",90,'A');
		theStudent.showStudent();
		System.out.println("***********************");
	
		//Employee theEmployee = new Employee('F',24,"Reeta",345,"BTech",97,'A',7839,"Analyst",12000);
		Employee theEmployee = new Employee('M',"Smith",20000,"CEO");		
		theEmployee.showEmployee();
	}
}

class Person // can we say -  isA Person a Student?
{
	 private char gender;
	 private int age;
	 private String name;
	 
	//Person() { }
	
	public Person(char gender, int age, String name) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
	}
	
	void showPerson() { //Exclusive - cum - Inherited method 
		System.out.println("--PERSONAL INFO--");
		System.out.println("Gender : "+gender);
		System.out.println("Age    : "+age);
		System.out.println("Name   : "+name);
		System.out.println("-----------------");
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





