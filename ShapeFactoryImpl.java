
public class ShapeFactoryImpl extends AbstractFactory {
	
	public Shape getShape(String hint) //shape factory
	{
		Shape shape=null; //interface handle
		
		if(hint == null)
			return null;
		else if (hint.equalsIgnoreCase("circ")) {
			shape = new Circle();
		}
		else if (hint.equalsIgnoreCase("rect")) {
			shape = new Rectangle();
		}
		else if (hint.equalsIgnoreCase("sqa")) {
			shape = new Square();
		}
		return shape;
	}


	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
