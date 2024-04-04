package abstractClassPackage;

public abstract class Shape {
	
	//Abstract method
	abstract void calculateArea();
	
	//Concrete method
	void display() {
		System.out.println("This is the Shape class");
	}
}
