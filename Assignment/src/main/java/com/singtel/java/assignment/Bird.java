package com.singtel.java.assignment;

import com.singtel.java.assignment.constants.PrintConstants;

public class Bird extends Animal{
	
	
	public boolean swim() {
		System.out.println(PrintConstants.NO_SWIMMING);
		return false;
	}
	
}
