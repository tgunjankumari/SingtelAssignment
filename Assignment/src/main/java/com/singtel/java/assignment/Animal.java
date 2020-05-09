package com.singtel.java.assignment;

import com.singtel.java.assignment.constants.PrintConstants;

public abstract class Animal implements AnimalTraits{


	public boolean walk() {
		System.out.println(PrintConstants.WALKING);
		return true;
	}

	public boolean fly() {
		System.out.println(PrintConstants.FLYING);
		return true;
	}

	public boolean sing() {
		System.out.println(PrintConstants.SINGING);
		return true;
	}
	
	public boolean swim() {
		System.out.println(PrintConstants.SWIMMING);
		return true;
	}
	
	
}
