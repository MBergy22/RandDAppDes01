package abstractClassPackage2;

public class Circle2 extends ShapeWithRadius{
	float area;
	
	public void calculateArea() {
		area = 3.14F * radius * radius;
	}
	
	public float getArea() {
		return area;
	}
}
