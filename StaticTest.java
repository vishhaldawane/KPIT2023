
public class StaticTest {
	public static void main(String[] args) {
	
		Kite.showKiteCount();
		
		Kite kite1 = new Kite("Orange",60,"Gyan",true);
		Kite kite2 = new Kite("White",40,"Shubham",true);
		Kite kite3 = new Kite("Green",50,"Maswood",true);

		Kite.showKiteCount();

	}
}

class Kite
{
	private String color; //per object
	private int length; //per objecrt
	private String owner; //per object
	private boolean flying; // is flying or not
	
	private static int kiteCount; //it is created only ONCE, a single copy
	
	public  static void showKiteCount() {
		System.out.println("How many kites in the sky ? "+kiteCount);
	}

	public Kite(String color, int length, String owner, boolean flying) {
		super();
		System.out.println("Kite created...");
		this.color = color;
		this.length = length;
		this.owner = owner;
		this.flying = flying;
		++kiteCount; //increment it as new Kite created
	}

	void show() {
		System.out.println("Kite owner  : "+owner);
		System.out.println("Kite color  : "+color);
		System.out.println("Kite length : "+length);
		System.out.println("Kite flying : "+flying);
		System.out.println("--------------------");
	}
	
	
	
	
}