
public class FinalTest {
	public static void main(String[] args) {
		
		final float PI=3.14f; //as a local constant of this method
		
		System.out.println("PI : "+PI);
		
		//PI=3.19f;
		
		System.out.println("PI : "+PI);
		
		Circle circle = new Circle(40);
		circle.showCircle();
	}
}

class Circle
{
	float radius;
	final float PI=3.14f; // as a DATA member/FIELD
	
	Circle(float r) {
		radius = r;
	}
	
	void showCircle() {
		float area = PI * radius * radius;
		System.out.println("Area of circle of radius "+radius +" is "+area);
		
	}
}
