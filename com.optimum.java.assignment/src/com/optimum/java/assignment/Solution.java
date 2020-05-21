package com.optimum.java.assignment;

import org.junit.Test;

public class Solution {
	@Test
	public static void main(String[] args) {
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(null, null, null),
				new Shark(null, null, null),
				new Clownfish(null, null, null),
				//new Dolhpin(),
				//new Frog(),
				//new Dog(),
				//new Butterfly(),
				//new Cat()
				};
//		((Bird) animals[0]).sing();
}
}