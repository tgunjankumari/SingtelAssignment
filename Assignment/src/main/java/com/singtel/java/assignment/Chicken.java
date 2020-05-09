package com.singtel.java.assignment;

import com.singtel.java.assignment.constants.PrintConstants;

public class Chicken extends Bird{

	public boolean sing() {
		System.out.println(PrintConstants.CHICKEN_SINGING);	
		return true;
	}
	
	public boolean fly() {
		System.out.println(PrintConstants.NO_FLYING);
		return false;
	}
	
	public boolean swim() {
		System.out.println(PrintConstants.NO_SWIMMING);
		return false;
	}
}
