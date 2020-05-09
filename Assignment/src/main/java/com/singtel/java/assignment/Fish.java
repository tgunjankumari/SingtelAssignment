package com.singtel.java.assignment;

import com.singtel.java.assignment.constants.PrintConstants;

public class Fish extends Animal{

	public boolean sing() {
		System.out.println(PrintConstants.NO_SINGING);	
		return false;
	}
	
	public boolean walk() {
		System.out.println(PrintConstants.NO_WALKING);	
		return false;
	}

}
