package com.singtel.java.assignment.suppliers;

import java.util.function.Supplier;

import com.singtel.java.assignment.Duck;

public class DuckSupplier implements Supplier<Duck>{

	public Duck get() {
		return new Duck();
	}


}
