import java.util.Scanner;

public class MenuTest {
	public static void main(String[] args) {
		
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
		int choice = scanner.nextInt();
		
		if(choice >= 11 && choice <=15) { //RANGE
			System.out.println("Searching... with if.");
		}
		else if(choice == 2) {
			System.out.println("Sorting....");
		}
		else if(choice == 3) {
			System.out.println("Inserting....");
		}
		else if(choice == 4) {
			System.out.println("Updating....");
		}
		else if(choice == 5) {
			System.out.println("Delete....");
		}
		else if(choice == 6) {
			System.out.println("Exiting....");
		}
		else  {
			System.out.println("Invalid Choice....");
		}
		
		
	}
}
