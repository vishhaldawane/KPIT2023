import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test; //Junit 5 

import entity.Department;

public class TestDepartment {

	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	
	public TestDepartment() {
		System.out.println("TestDepartment()...ctor...");
		//begin to interact with ORM "Framework" now
		entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("Entity Manager Factory : "+entityManagerFactory);
				
	    entityManager = entityManagerFactory.createEntityManager();
		System.out.println("Entity Manager : "+entityManager);
				
	}
	@Test
	public void createDepartmentTest() {
		System.out.println("createDepartmentTest is executed....");
		EntityTransaction transaction = entityManager.getTransaction();
		System.out.println("Got the transaction....");
			transaction.begin();
				Department newDept = new Department();
				newDept.setDepartmentNumber(20);
				newDept.setDepartmentName("TESTING");
				newDept.setDepartmentLocation("Finland");
			
				entityManager.persist(newDept);
			transaction.commit();
	}
	
	@Test
	public void modifyDepartmentTest() {
		System.out.println("modifyDepartmentTest is executed....");
		EntityTransaction transaction2 = entityManager.getTransaction();
		System.out.println("Got the transaction....");
			transaction2.begin();
				Department existingDept = entityManager.find(Department.class,20);
				System.out.println("Current Dept Name : "+existingDept.getDepartmentName());
				System.out.println("Current Dept Loc  : "+existingDept.getDepartmentLocation());
				System.out.println("Setting new values....");	
				//NEVER MODIFY THE PRIMARY KEY via setter, it will contradict 
				existingDept.setDepartmentName("TEST");
				existingDept.setDepartmentLocation("Germany");
			
				entityManager.merge(existingDept); //fires the UPDATE query
			transaction2.commit();
	}

	@Test
	public void deleteDepartmentTest() {
		System.out.println("deleteDepartmentTest is executed....");
		EntityTransaction transaction3 = entityManager.getTransaction();
		System.out.println("Got the transaction....");
			transaction3.begin();
				Department deptToDelete = entityManager.find(Department.class,20);
				System.out.println("Current Dept Name : "+deptToDelete.getDepartmentName());
				System.out.println("Current Dept Loc  : "+deptToDelete.getDepartmentLocation());
				System.out.println("Deleting this object");	
			
				entityManager.remove(deptToDelete);//fires the DELETE query
			transaction3.commit();
			System.out.println("DELETED the existing Object ....");
		
	}
	
	@Test
	public void selectDepartmentTest() {
		System.out.println("selectDepartmentTest is executed....");
		Department dept = entityManager.find(Department.class,20);
		
		Assertions.assertTrue(dept!=null); //
		
		System.out.println("DEPTNO    : "+dept.getDepartmentNumber());
		System.out.println("DEPT NAME : "+dept.getDepartmentName());
		System.out.println("LOCATION  : "+dept.getDepartmentLocation());
	
	}
	
	@Test
	public void selectAllDepartmentsTest() {
		System.out.println("selectAllDepartmentsTest is executed....");
		Query theQuery = entityManager.createQuery(" from Department"); // JPQL | select * from dept <-- internally fired
		List<Department> deptList = theQuery.getResultList();
		System.out.println("got the JPQL run and fired...");
		
		Assertions.assertTrue(deptList!=null);
		
			Iterator<Department> iterator = deptList.iterator();
			System.out.println("Got the Iterator...");
		
		Assertions.assertTrue(deptList.size() > 0) ;
		
		System.out.println("Before loop");

		while(iterator.hasNext()) {
			Department dept = iterator.next();
			
			System.out.println("DEPTNO    : "+dept.getDepartmentNumber());
			System.out.println("DEPT NAME : "+dept.getDepartmentName());
			System.out.println("LOCATION  : "+dept.getDepartmentLocation());
			System.out.println("---------------------------");
	
		}
		System.out.println("After loop");
	}
	
	@Test
	public void sampleTest() {
		System.out.println("Line1");
		System.out.println("Line2");
		System.out.println("Line3");
		
		Assertions.assertTrue(10 > 5);
		
		System.out.println("Line4");
		System.out.println("Line5");
		System.out.println("Line6");

		Assertions.assertFalse(10 < 5);

		System.out.println("Line7");
		System.out.println("Line8");
		System.out.println("Line9");
		System.out.println("Line10");
			
	}

}
