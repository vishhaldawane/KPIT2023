
public class DivisionTest {
	public static void main(String[] args) {
		
		System.out.println("Begin of main");

			MyCalculator calci = new MyCalculator();
			
			try {
				String str=null;
			
				System.out.println("str in lower case : "+str.toLowerCase());
				System.out.println("str in upper case : "+str.toUpperCase());
			
				System.out.println("char at 3 in str  : "+str.charAt(22));
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("Problem 1 : "+e); //would print exception class with message
			}
			catch(NullPointerException e) {
				System.out.println("Probelm 2 :"+e);
			}
			
			calci.divide(10, 0);
			calci.divide(50, 5);
			calci.divide(70, 0);
			calci.divide(90, 9);
			
		System.out.println("End of main");

	}
}


class MyCalculator
{
	
	void divide(int num, int deno) {
		
		System.out.println("--> Begin of divide");
		
		System.out.println("num  : "+num);
		System.out.println("deno : "+deno);
		
		System.out.println("trying to divide "+num+ " by "+deno);
		
		/*if(deno != 0) { //DIVIDE LOGIC HERE | BUSINESS LOGIC HERE
			int division = num / deno;
			System.out.println("division : "+division);
		}
		else { //ERROR HANDLING LOGIC HERE
			System.out.println("cannot divide by zero : "+deno);
		}*/
		
		
		try
		{
			int division = num / deno; // if deno is 0, then JVM throws an exception named as ArithmeticException();
			System.out.println("division : "+division);
		}
		catch(ArithmeticException e) {
			System.out.println("Problem : "+e);
		}
		System.out.println("--> End of divide\n");
	}
}