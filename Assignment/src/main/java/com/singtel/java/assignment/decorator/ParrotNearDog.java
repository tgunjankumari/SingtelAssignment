package com.singtel.java.assignment.decorator;

import com.singtel.java.assignment.Parrot;
import com.singtel.java.assignment.constants.PrintConstants;

public class ParrotNearDog extends ParrotDecorator{

	public ParrotNearDog(Parrot parrot) {
		super(parrot);
	}
	
	public boolean sing() {
		super.sing();
		System.out.println(PrintConstants.DOG_SINGING);
		return true;
	}

}
