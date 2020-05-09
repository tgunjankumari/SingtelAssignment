package com.singtel.java.assignment.suppliers;

import java.util.function.Supplier;

import com.singtel.java.assignment.Fish;

public class FishSupplier implements Supplier<Fish>{

	public Fish get() {
		return new Fish();
	}


}
