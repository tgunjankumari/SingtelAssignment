package com.singtel.java.assignment.decorator;

import com.singtel.java.assignment.Parrot;

public class ParrotDecorator extends Parrot{

	private Parrot parrot;

	public ParrotDecorator(Parrot parrot) {
		this.parrot = parrot;
	}
	
	public boolean sing() {
		return this.parrot.sing();
	}
	
	
}
