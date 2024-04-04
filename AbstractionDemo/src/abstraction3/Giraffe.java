package abstraction3;

public class Giraffe extends Animal{
	
	Giraffe() {
		System.out.println("GIRAFFE inherits Animal.");
	}
	
	Giraffe(String name){
		super(name);
		System.out.println("GIRAFFE inherits Animal");
	}
	
	void display() {
		System.out.println("Giraffe display");
	}

	void sound() {
		System.out.println("Sound: Bleats");
	}

	void food() {
		System.out.println("Food: Herbivore");
	}
	
	void displayAll() {
		display();
		numOfEyes();
		numOfLimbs();
		sound();
		food();
	}

}
