package com.singtel.java.assignment;

public class Insect extends Animal {	

	public Insect metamorphosize(Caterpillar caterpillar) {
		return new Butterfly();
	}
	
}
