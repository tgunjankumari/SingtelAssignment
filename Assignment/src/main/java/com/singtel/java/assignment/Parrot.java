package com.singtel.java.assignment;

import com.singtel.java.assignment.constants.PrintConstants;

public class Parrot extends Bird{

	public boolean sing() {
		System.out.print(PrintConstants.PARROT_SAYS);	
		return true;
	}

	public boolean swim() {
		System.out.println(PrintConstants.NO_SWIMMING);
		return false;
	}
}
