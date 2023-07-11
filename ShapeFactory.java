
public class ShapeFactory {
	
	Shape shape; //interface handle
	
	
	public Shape getShape(String hint) //shape factory
	{
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
	
	
}
