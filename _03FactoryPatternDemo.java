import java.util.Scanner;


public class _03FactoryPatternDemo {
	public static void main(String[] args) {
		/*
		Circle c = new Circle();
		c.draw(); // here draw belongs to the Circle			
					// can be found during the compilation
		
		//name mangling is done at the compile time
		//name lookup or token lookup is done at the compile time
		//c.draw(); is converted as Circle.draw(c);
		
		
		Rectangle r = new Rectangle();
		r.draw();
		
		Square s = new Square();
		s.draw();
		*/
		
		int choice=0;
		ShapeFactory factory = new ShapeFactory(); // ShapeFactory.getInstance();
		Shape shape = null;
		
		do
		{
		
				System.out.println("Select shape");
				System.out.println("1. Circle");
				System.out.println("2. Rectangle");
				System.out.println("3. Square");
				System.out.println("4. Exit");
				System.out.println("Enter choice : ");
				Scanner scan = new Scanner(System.in);
				choice = scan.nextInt();
				
				switch(choice)
				{
					case 1:
						shape  = factory.getShape("circ"); break;
						
					case 2:
						shape  = factory.getShape("rect"); break;
						
					case 3:
						shape  = factory.getShape("sqa"); break;
						
					case 4:
						shape = null;
						break;
					default:
						System.out.println("Invalid choice...");
				}
				
				if(shape!=null)
					shape.draw();
				else {
					System.out.println("Shape not initialized...");
				}
				
		}while(choice!=4);
		
		
		System.out.println("End of main");
		
	}
}
