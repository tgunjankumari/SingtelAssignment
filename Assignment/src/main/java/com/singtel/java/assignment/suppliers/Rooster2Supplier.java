package com.singtel.java.assignment.suppliers;

import java.util.function.Supplier;

import com.singtel.java.assignment.Rooster2;

public class Rooster2Supplier implements Supplier<Rooster2>{

	public Rooster2 get() {
		return new Rooster2();
	}


}
