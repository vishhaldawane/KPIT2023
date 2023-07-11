public class _04AbstractFactoryPatternDemo {
	public static void main(String[] args) {

		System.out.println("Begin main..");
		
		AbstractFactory absFactory = FactoryProducer.getFactory("SHP");
		
		if(absFactory instanceof ShapeFactoryImpl)
		{
			System.out.println("Pointing to ShapeFactoryImpl");
			Shape sha =	absFactory.getShape("circ");
			sha.draw();
			sha =	absFactory.getShape("rect");
			sha.draw();
			sha =	absFactory.getShape("sqa");
			sha.draw();
		}
		else if(absFactory instanceof ColorFactoryImpl)
		{
			System.out.println("Pointing to ColorFactoryImpl");
			Color col = absFactory.getColor("red");
			col.fill();
			col = absFactory.getColor("green");
			col.fill();
			col = absFactory.getColor("blue");
			col.fill();
		}
		
		//https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
		
		System.out.println("End main..");

	}
}
