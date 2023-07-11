
public class FactoryProducer {

	public static AbstractFactory getFactory(String hint)
	{
		AbstractFactory factory=null;
		
		if(hint.equalsIgnoreCase("SHP")) {
			factory = new ShapeFactoryImpl();
		}
		else if(hint.equalsIgnoreCase("COL")) {
			factory = new ColorFactoryImpl();
		}
		return factory;
	}
}
