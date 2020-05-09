package com.singtel.java.assignment.suppliers;

import java.util.function.Supplier;

import com.singtel.java.assignment.Insect;

public class InsectSupplier implements Supplier<Insect>{

	public Insect get() {
		return new Insect();
	}


}
