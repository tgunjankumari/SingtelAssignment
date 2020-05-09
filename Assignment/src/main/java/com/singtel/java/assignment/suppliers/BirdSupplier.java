package com.singtel.java.assignment.suppliers;

import java.util.function.Supplier;

import com.singtel.java.assignment.Bird;

public class BirdSupplier implements Supplier<Bird>{

	public Bird get() {
		return new Bird();
	}


}
