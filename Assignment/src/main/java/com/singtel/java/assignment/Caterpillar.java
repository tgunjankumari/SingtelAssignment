package com.singtel.java.assignment;

import com.singtel.java.assignment.constants.PrintConstants;

public class Caterpillar extends Insect{

	public boolean fly() {
		System.out.println(PrintConstants.NO_FLYING);
		return false;
	}
}
