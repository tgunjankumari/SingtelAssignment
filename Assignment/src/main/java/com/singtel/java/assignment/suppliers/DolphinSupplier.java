package com.singtel.java.assignment.suppliers;

import java.util.function.Supplier;

import com.singtel.java.assignment.Dolphin;

public class DolphinSupplier implements Supplier<Dolphin>{

	public Dolphin get() {
		return new Dolphin();
	}


}
