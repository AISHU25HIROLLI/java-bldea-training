package bldeatrainning;

public class Dog {
	String name;
	String color;
	int cost;
	String breed;

	void eat() {
		System.out.println("Dog is eating");
	}
	void run() {
		System.out.println("Dog is running");
	}
	void bark() {
		System.out.println("Dog is barking");
	}
	void sleep() {
		System.out.println("Dog has slept");
	}
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.name="Tommy";
		d1.color="brown";
		d1.cost=3000;
		d1.breed="GR";
		d1.eat();
		d1.run();
		d1.bark();
		d1.sleep();
	}

}







