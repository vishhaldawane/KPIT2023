import java.util.Scanner;

public class MenuTest2 {
	public static void main(String[] args) {
		
	int choice=0;
	
	do {
		System.out.println("M E N U");
		System.out.println("-------------");
		System.out.println("1. Search");
		System.out.println("2. Sort");
		System.out.println("3. Insert");
		System.out.println("4. Update");
		System.out.println("5. Delete");
		System.out.println("-------------");
		System.out.println("6. Exit");
		System.out.println("-------------");
		
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();
		
		switch(choice)
		{
			case 11: 
			case 12: 
			case 13: 
			case 14: 
			case 15: System.out.println("Searching...."); break;
			
			case 2: System.out.println("Sorting...."); break;
			case 3: System.out.println("Inserting...."); break;	
			case 4: System.out.println("Updating....");break;	
			case 5: System.out.println("Delete....");break;		
			case 6: System.out.println("Exiting....");break;		
			default: 
			System.out.println("Invalid Choice....");break;
		
		}
	} while(choice!=6);
		System.out.println("END of MAIN");
	}
}
