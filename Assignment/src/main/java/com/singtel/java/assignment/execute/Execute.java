package com.singtel.java.assignment.execute;

import com.singtel.java.assignment.Animal;
import com.singtel.java.assignment.Parrot;
import com.singtel.java.assignment.constants.Species;
import com.singtel.java.assignment.decorator.ParrotNearCat;
import com.singtel.java.assignment.decorator.ParrotNearDog;
import com.singtel.java.assignment.decorator.ParrotNearRooster;
import com.singtel.java.assignment.factory.AnimalFactory;

public class Execute {

	public static void main(String[] args) {
		
		AnimalFactory animalFactory=new AnimalFactory();

		System.out.println("========= BIRD =========");
		Animal animal=animalFactory.getAnimal(Species.BIRD);
		animal.sing();
		
		System.out.println("========= DUCK =========");
		animal=animalFactory.getAnimal(Species.DUCK);
		animal.sing();
		animal.swim();
		
		System.out.println("========= CHICKEN =========");
		animal=animalFactory.getAnimal(Species.CHICKEN);
		animal.sing();
		animal.fly();
		
		System.out.println("========= ROOSTER =========");
		animal=animalFactory.getAnimal(Species.ROOSTER);
		animal.sing();
		animal.swim();
		
		System.out.println("========= ROOSTER WITHOUT INHERITANCE =========");
		animal=animalFactory.getAnimal(Species.ROOSTER2);
		animal.sing();
		animal.swim();
		animal.fly();
		animal.walk();
		
		System.out.println("========= PARROT =========");
		animal=animalFactory.getAnimal(Species.PARROT);
		
		Animal parrotNearCat=new ParrotNearCat((Parrot) animal);
		parrotNearCat.sing();
		
		Animal parrotNearDog=new ParrotNearDog((Parrot) animal);
		parrotNearDog.sing();
		
		Animal parrotNearRooster=new ParrotNearRooster((Parrot) animal);
		parrotNearRooster.sing();
		
		System.out.println("========= FISH =========");
		animal=animalFactory.getAnimal(Species.FISH);
		animal.swim();
		animal.walk();
		animal.sing();
		
		
	}
}
