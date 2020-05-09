package com.singtel.java.assignment.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.singtel.java.assignment.Animal;
import com.singtel.java.assignment.constants.Species;
import com.singtel.java.assignment.suppliers.BirdSupplier;

public class AnimalFactory {

	private static final Map<Species, Supplier<? extends Animal>> animalSuppliers = new HashMap<Species, Supplier<? extends Animal>>();

	static {
		animalSuppliers.put(Species.BIRD, new BirdSupplier());
	}

	public static void registerAnimalType(Species animalType, Supplier<? extends Animal> supplier) {
		animalSuppliers.put(animalType, supplier);
	}

	public static Animal getAnimal(Species animalType) {
		Supplier<? extends Animal> supplier = animalSuppliers.get(animalType);
		return supplier.get() != null ? supplier.get() : null;
	}

}
