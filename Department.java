package entity; //1. it must be in a package

//POJO | Java Bean | Component

//5 aspects


//Object Relation Mapping = Hibernate | Toplink ORM F/w
// JAVA    TABLE MAPPING

//2 - must be public

public class Department //matching class as per the Dept Table
{

	//3 private data 
	private int departmentNumber; //matching with DEPTNO column of the Dept Table
	private String departmentName; //DEPTNAME
	private String departmentLocation; //LOC
	
	
	//4 a public no-arg constructor
	
	public Department() {
		System.out.println("Department() .....");
	}
	//5 setter/getters


	public int getDepartmentNumber() {
		return departmentNumber;
	}


	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getDepartmentLocation() {
		return departmentLocation;
	}


	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}

	

}
