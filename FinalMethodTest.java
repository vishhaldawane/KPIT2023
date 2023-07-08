
public class FinalMethodTest {
	public static void main(String[] args) {
		
		Chess chess = new Chess();
		//chess = new GraphicalChess();
		chess = new WebBasedGraphicalChess();//its not a Chess, hence cannot be assinged to a Chess's reference
		
		chess.moveBishop();//super class reference is UNAWARE of child class EXCLUSIVE methods
	}
}

class Chess //Shubham Kolar has created this class - spent 4 weeks to develop this class with all methods and math logic
{
	void moveBishop() { // Camel W/B
		System.out.println("Moving bishop mathematically : diagonally 1/N Steps In foward/backward directionally");
	}
}

final class GraphicalChess extends Chess // Maswood - 3 weeks to develope
{
	final void moveBishop() { //overriding is perfect
		super.moveBishop(); //utilize the math logic from the super class
		System.out.println("Moving bishop graphically : diagonally 1/N steps In backward/forward direction....");
	}
}

class WebBasedGraphicalChess //extends GraphicalChess // Ansh Prakash
{
	void moveMyBishop() { //overriding is perfect as per the syntax : but totally invalid and against the contract of the parent classes
		System.out.println("Moving bishop graphically on web page : vertically 1/N steps In backward direction....");
	}
}
