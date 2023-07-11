
public class ColorFactoryImpl extends AbstractFactory {
	
	public Shape getShape(String hint) //shape factory
	{
		return null;
	}


	@Override
	Color getColor(String hint) {
	
		Color color =null; //interface handle
		
		if(hint == null)
			return null;
		
		else if (hint.equalsIgnoreCase("red")) {
			color = new Red();
		}
		else if (hint.equalsIgnoreCase("green")) {
			color = new Green();
		}
		else if (hint.equalsIgnoreCase("blue")) {
			color = new Blue();
		}
		return color;
	}
	
	
}
