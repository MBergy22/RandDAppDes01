package abstractClassPackage2;
import abstractClassPackage2.Circle2;

public class TestMain2 {
	public static void main(String[] args) {
		Circle2 c2 = new Circle2();
		c2.setRadius(7.1F);
		c2.calculateArea();
		c2.display();
		System.out.println("Circle area: " + c2.getArea());
	}
}
