package abstractClassPackage;

public class TestMain {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.setRadius(3.2F);
		circle.setColor("red)");
		circle.calculateArea();
		
		circle.display();
		System.out.println("\nCircle color: " + circle.getColor());
		System.out.println("Circle area: " + circle.getArea());
	}
}
