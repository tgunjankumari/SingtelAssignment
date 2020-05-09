package com.singtel.java.assignment;

import com.singtel.java.assignment.constants.PrintConstants;

public abstract class Animal implements AnimalTraits{


	public void walk() {
		System.out.println(PrintConstants.WALKING);
	}

	public void fly() {
		System.out.println(PrintConstants.FLYING);
	}

	public void sing() {
		System.out.println(PrintConstants.SINGING);		
	}
}
