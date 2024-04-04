package abstractClassPackage;

public class Circle extends Shape {
	
	String color;
	float radius, area;
	
	void setRadius(float radius ) {
		this.radius = radius;
	}
	void setColor(String color) {
		this.color = color;
	}
	String getColor() {
		return color;
	}
	float getArea() {
		return area;
	}
	void calculateArea() {
		area = 3.14F * radius * radius;
	}
}
