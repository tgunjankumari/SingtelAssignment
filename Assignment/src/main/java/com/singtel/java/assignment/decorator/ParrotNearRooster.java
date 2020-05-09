package com.singtel.java.assignment.decorator;

import com.singtel.java.assignment.Parrot;
import com.singtel.java.assignment.constants.PrintConstants;

public class ParrotNearRooster extends ParrotDecorator{

	public ParrotNearRooster(Parrot parrot) {
		super(parrot);
	}
	
	public boolean sing() {
		super.sing();
		System.out.println(PrintConstants.ROOSTER_SINGING);
		return true;
	}

}
