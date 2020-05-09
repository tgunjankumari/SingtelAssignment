package com.singtel.java.assignment.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.singtel.java.assignment.Animal;
import com.singtel.java.assignment.constants.Species;
import com.singtel.java.assignment.suppliers.BirdSupplier;
import com.singtel.java.assignment.suppliers.ChickenSupplier;
import com.singtel.java.assignment.suppliers.DolphinSupplier;
import com.singtel.java.assignment.suppliers.DuckSupplier;
import com.singtel.java.assignment.suppliers.FishSupplier;
import com.singtel.java.assignment.suppliers.ParrotSupplier;
import com.singtel.java.assignment.suppliers.Rooster2Supplier;
import com.singtel.java.assignment.suppliers.RoosterSupplier;

public class AnimalFactory {

	private static final Map<Species, Supplier<? extends Animal>> animalSuppliers = new HashMap<Species, Supplier<? extends Animal>>();

	static {
		animalSuppliers.put(Species.BIRD, new BirdSupplier());
		animalSuppliers.put(Species.DUCK, new DuckSupplier());
		animalSuppliers.put(Species.CHICKEN, new ChickenSupplier());
		animalSuppliers.put(Species.ROOSTER, new RoosterSupplier());
		animalSuppliers.put(Species.ROOSTER2, new Rooster2Supplier());
		animalSuppliers.put(Species.PARROT, new ParrotSupplier());
		animalSuppliers.put(Species.FISH, new FishSupplier());
		animalSuppliers.put(Species.DOLPHIN, new DolphinSupplier());
	}

	public static void registerAnimalType(Species animalType, Supplier<? extends Animal> supplier) {
		animalSuppliers.put(animalType, supplier);
	}

	public static Animal getAnimal(Species animalType) {
		Supplier<? extends Animal> supplier = animalSuppliers.get(animalType);
		return supplier.get() != null ? supplier.get() : null;
	}

}
