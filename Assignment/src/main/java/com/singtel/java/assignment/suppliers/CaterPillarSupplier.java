package com.singtel.java.assignment.suppliers;

import java.util.function.Supplier;

import com.singtel.java.assignment.Caterpillar;

public class CaterPillarSupplier implements Supplier<Caterpillar>{

	public Caterpillar get() {
		return new Caterpillar();
	}


}
	