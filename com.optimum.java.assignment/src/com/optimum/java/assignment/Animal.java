package com.optimum.java.assignment;

class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}

	void sing() {
		System.out.println("I am singing");
	}
}

class Duck extends Bird {
	void makeSound() {
		System.out.println("Quack, quack");
	}

	void swim() {
		System.out.println("I am swimming");
	}
}

class Chicken extends Bird {

	void fly() {
		System.out.println("Cannot fly");
	}

	void makeSound() {
		System.out.println("Cluck, cluck");
	}
}

class Rooster extends Chicken {
	String gender = "Male"; // the relative attribute of a rooster to a chicken

	void makeSound() {
		System.out.println("Cock-a-doodle-doo");
	}
}

class Parrot extends Bird {
	String learnedSound;

	public void setLearnedSound() {
		switch (learnedSound) {
		case "dog":
			learnedSound = "Woof, woof";
			break;
		case "cat":
			learnedSound = "Meow";
			break;
		case "rooster":
			learnedSound = "Cock-a-doodle-doo";
			break;
		}	
	}
}

class Fish extends Animal {
	public String size;
	public String colour;
	public String behaviour;

	public Fish(String size, String colour, String behaviour) {
		super();
		this.size = size;
		this.colour = colour;
		this.behaviour = behaviour;
	}

	void swim() {
		System.out.println("Swimming");
	}

	void walk() {
		System.out.println("Cannot walk");
	}
}

class Shark extends Fish {

	public Shark(String size, String colour, String behaviour) {
		super(size = "large", colour = "grey", behaviour = "eats other fish");
	}
}

class Clownfish extends Fish {

	public Clownfish(String size, String colour, String behaviour) {
		super(size = "small", colour = "colourful (orange)", behaviour = "makes jokes");
	}
}
