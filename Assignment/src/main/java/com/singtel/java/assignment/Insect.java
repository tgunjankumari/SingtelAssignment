package com.singtel.java.assignment;

import com.singtel.java.assignment.constants.PrintConstants;

public class Insect extends Animal {	

	public Insect metamorphosize(Caterpillar caterpillar) {
		return new Butterfly();
	}
	
	public boolean swim() {
		System.out.println(PrintConstants.NO_SWIMMING);
		return false;
	}
	
}
