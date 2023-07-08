
public class PassingObjectAndReturningObject {
	public static void main(String[] args) {
	
		Lemon lemon = new Lemon();
		
		lemon.setColor("Yellow");
		lemon.setCost(5);
		lemon.setQuantity(1); //what if the lemon qty is +/-
		lemon.setSize("Circular");
		lemon.setTaste("Sour");
		
		Water water = new Water();
		water.setColor("Clear");
		water.setPrice(10);
		water.setQuantity(100); //what if the water qty is +/-
		water.setType("Mineral");
		
		Sugar sugar = new Sugar();
		sugar.setCost(5);
		sugar.setQuantity(10); //what if the sugar is +/-
		sugar.setTaste("Sweet");
		sugar.setType("Organic");
		
	
		Kitchen kitchen = new Kitchen();
		LemonJuice theJuice = kitchen.makeASoftDrink(lemon, water, sugar);
		System.out.println("The Juice Qty   : "+theJuice.getQuantity());
		System.out.println("The Juice Taste : "+theJuice.getTaste());
		
		System.out.println("------------------");
		
		TeaBag teaBag = new TeaBag();
		teaBag.setBrand("TATA Tea");
		teaBag.setQty(1);
		teaBag.setTaste("Ginger");
		

		LemonTea theTea = kitchen.makeTea(lemon, water, sugar, teaBag);
		System.out.println("Tea Qty : "+theTea.getQuanity());
		System.out.println("Tea Taste : "+theTea.getTaste());
		System.out.println("------------------");

		
		Milk milk = new Milk();
		milk.setColor("OffWhite");
		milk.setType("Gir Cow A2 Milk"); //Authentic Indian Cow, hump on her neckline, it has direct connection with Sunlight and her blood
		milk.setQty(50); //50 ml
		
		Tea tea = kitchen.makeTea(milk, water, sugar, teaBag);
		System.out.println("Tea Qty : "+tea.getQuanity());
		System.out.println("Tea Taste : "+sugar.getTaste()+" "+teaBag.getTaste());
		
		
	}
}

class Juice
{
	
}

class LemonJuice extends Juice //isA
{
	int quantity;
	String taste;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	
}



class Tea
{
	int quanity;
	String taste;
	
	public int getQuanity() {
		return quanity;
	}
	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	
}

class LemonTea extends Tea //isA
{
	int sourLevel;
	int sweetLevel;
	public int getSourLevel() {
		return sourLevel;
	}
	public void setSourLevel(int sourLevel) {
		this.sourLevel = sourLevel;
	}
	public int getSweetLevel() {
		return sweetLevel;
	}
	public void setSweetLevel(int sweetLevel) {
		this.sweetLevel = sweetLevel;
	}
	
	

}

class Kitchen
{
	
	//return object as a return value
	
					//pass objects here inside the arguments
	LemonJuice makeASoftDrink(Lemon x, Water y, Sugar z) {
		System.out.println("Making a soft drink.....");//of taste "+x.getTaste()+ " and "+z.getTaste()+" qty "+y.getQuantity()+"ml");
		LemonJuice juice = new LemonJuice(); // blank object
		juice.setQuantity(y.getQuantity()); //water's quantity is the ultimate quantity of the juice
		juice.setTaste(x.getTaste()+","+z.getTaste());
		return juice; // return the object of LemonJuice Type
	}
	
	LemonTea makeTea(Lemon lemon, Water water, Sugar sugar, TeaBag teaBag) {
		
		System.out.println("Making a lemon tea...");
		LemonTea lemonTea = new LemonTea();
		lemonTea.setQuanity(water.getQuantity());
		lemonTea.setTaste(lemon.getTaste()+" and "+teaBag.getTaste());
		lemonTea.setSweetLevel(5); //on the scale of 1 to 10
		lemonTea.setSourLevel(3); // on the scale of 1 to 5
		return lemonTea;
		
	}
	
	Tea makeTea(Milk milk, Water water, Sugar sugar, TeaBag teaBag) {
		
		System.out.println("Making a lemon tea...");
		Tea tea = new Tea();
		tea.setQuanity(water.getQuantity());
		tea.setTaste(teaBag.getTaste());
		return tea;
		
	}
}

class Milk
{
	int qty;
	String type;
	String color;
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}

class TeaBag
{
	String brand;
	String taste;
	int qty;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}
class Lemon
{
	String color;
	String size;
	int cost;
	int quantity;
	String taste; 
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}


}

//Lombok API - where u dont have to add setter/getter 

class Water
{
	String type; //mineral | tap | filter
	int quantity;
	String color;
	int price;
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}

class Sugar
{
	String type;
	int quantity;
	int cost;
	String taste;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	
}

/*
 * 
 System.out.println("Lemon color : "+lemon.getColor());
		System.out.println("Lemon cost  : "+lemon.getCost());
		System.out.println("Lemon Qty   : "+lemon.getQuantity());
		System.out.println("Lemon Size  : "+lemon.getSize());
		System.out.println("Lemon Taste : "+lemon.getTaste());
		
 */
