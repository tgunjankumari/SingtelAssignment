package com.singtel.java.assignment.decorator;

import com.singtel.java.assignment.Parrot;
import com.singtel.java.assignment.constants.PrintConstants;

public class ParrotNearCat extends ParrotDecorator{

	public ParrotNearCat(Parrot parrot) {
		super(parrot);
	}
	
	public boolean sing() {
		super.sing();
		System.out.println(PrintConstants.CAT_SINGING);
		return true;
	}

}
