
public class HasATest {
	public static void main(String[] args) {
		Human human = new Human();
		human.heart.pumping();
		human.liver.creatingBlood();
		human.leftKidney.filterBlood();
		human.rightKidney.filterBlood();
		human.leftLung.oxygenation();
		human.rightLung.oxygenation();
		human.think();
	}
}

class Human
{
	Heart heart = new Heart(); //hasA
	Liver liver = new Liver();
	Kidney rightKidney = new Kidney();
	Kidney leftKidney = new Kidney();
	
	Lung rightLung = new Lung();
	Lung leftLung = new Lung();
	
	void think() {
		System.out.println("Human is thinking...");
	}
	void eat() {
		System.out.println("Human is eating...");
	}
}
class Heart
{
	void pumping() {
		System.out.println("Heart is pumping...");
	}
}
class Liver
{
	void creatingBlood() {
		System.out.println("Liver is creating blood...");
	}
}
class Kidney {
	void filterBlood() {
		System.out.println("Kidney Filtering blood....");
	}
}
class Lung {
	void oxygenation() {
		System.out.println("Lung is exchanging Oxygen and Co2");
	}
}