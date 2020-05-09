package com.singtel.java.assignment.suppliers;

import java.util.function.Supplier;

import com.singtel.java.assignment.Bird;
import com.singtel.java.assignment.Chicken;

public class ChickenSupplier implements Supplier<Bird>{

	public Chicken get() {
		return new Chicken();
	}


}
