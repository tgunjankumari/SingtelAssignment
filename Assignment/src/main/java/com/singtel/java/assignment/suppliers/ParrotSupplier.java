package com.singtel.java.assignment.suppliers;

import java.util.function.Supplier;

import com.singtel.java.assignment.Parrot;

public class ParrotSupplier implements Supplier<Parrot>{

	public Parrot get() {
		return new Parrot();
	}


}
