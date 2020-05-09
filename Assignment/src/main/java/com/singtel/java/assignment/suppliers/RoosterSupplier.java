package com.singtel.java.assignment.suppliers;

import java.util.function.Supplier;

import com.singtel.java.assignment.Rooster;

public class RoosterSupplier implements Supplier<Rooster>{

	public Rooster get() {
		return new Rooster();
	}


}
