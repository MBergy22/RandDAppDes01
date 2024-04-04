package abstraction3;

public class Lion extends Animal{
	
	Lion() {
		System.out.println("LION inherits Animal.");
	}
	
	Lion(String name){
		super(name);
		System.out.println("LION inherits Animal.");
	}
	
	void display() {
		System.out.println("Lion Display");
	}
	
	void sound() {
		System.out.println("Sound: Roar");
	}
	
	void food() {
		System.out.println("Food: Carnivore");
	}
	
	void displayAll() {
		display();
		numOfEyes();
		numOfLimbs();
		sound();
		food();
	}
}
