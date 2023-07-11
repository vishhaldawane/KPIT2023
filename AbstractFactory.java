
public abstract class AbstractFactory {
	 abstract Color getColor(String color);
	 abstract Shape getShape(String shape) ;
	 
}
/*

			FactoryProducer
				 |
			-------------
			|			|
			SHP			COL
			|			 |
	ShapeFactoryImpl	ColorFactoryImpl
			

		AbstractFactory
				|getColor()
				|getShape()
	----------------------------
	|						|
ShapeFactoryImpl		ColorFactoryImpl			ColouredShapeFactoryImpl
	getColor(){null}		getColor(){r/g/b}
	getShape(){c/r/s}		getShape(){null}
	
	Shape					Color
	 |draw();				  |fill();
C    R    S				R     G     B	 		RedCircle	RR  RS
												GreenCircle GR	GS
												BlueCircle  BR	BS
*/