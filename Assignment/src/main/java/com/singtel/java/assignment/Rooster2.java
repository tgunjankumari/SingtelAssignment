package com.singtel.java.assignment;

import com.singtel.java.assignment.constants.PrintConstants;

public class Rooster2 extends Animal{
	
	Chicken chicken=new Chicken();
	
	public boolean fly() {
		return chicken.fly();
	}
	
	public boolean sing() {
		System.out.println(PrintConstants.ROOSTER_SINGING);	
		return true;
	}

	public boolean swim() {
		return chicken.swim();
	}
	
}
