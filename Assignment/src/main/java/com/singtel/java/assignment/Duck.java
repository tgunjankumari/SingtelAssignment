package com.singtel.java.assignment;

import com.singtel.java.assignment.constants.PrintConstants;

public class Duck extends Bird{

	public boolean sing() {
		System.out.println(PrintConstants.DUCK_SINGING);	
		return true;
	}
	
	public boolean fly() {
		System.out.println(PrintConstants.NO_FLYING);
		return false;
	}
	
}
