package com.singtel.java.assignment.suppliers;

import java.util.function.Supplier;

import com.singtel.java.assignment.Butterfly;

public class ButterflySupplier implements Supplier<Butterfly>{

	public Butterfly get() {
		return new Butterfly();
	}


}
	