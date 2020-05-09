package com.singtel.java.assignment;

import com.singtel.java.assignment.constants.PrintConstants;

public class Dolphin extends Animal{

	public boolean walk() {
		System.out.println(PrintConstants.NO_WALKING);
		return false;
	}

}
