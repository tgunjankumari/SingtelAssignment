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
		Animal bird=animalFactory.getAnimal(Species.BIRD);
		bird.sing();
		
		bird=animalFactory.getAnimal(Species.DUCK);
		bird.sing();
		bird.swim();
		
		bird=animalFactory.getAnimal(Species.CHICKEN);
		bird.sing();
		bird.fly();
		
		bird=animalFactory.getAnimal(Species.ROOSTER);
		bird.sing();
		bird.swim();
		
		bird=animalFactory.getAnimal(Species.ROOSTER2);
		bird.sing();
		bird.swim();
		bird.fly();
		bird.walk();
		
		bird=animalFactory.getAnimal(Species.PARROT);
		
		Animal parrotNearCat=new ParrotNearCat((Parrot) bird);
		parrotNearCat.sing();
		Animal parrotNearDog=new ParrotNearDog((Parrot) bird);
		parrotNearDog.sing();
		Animal parrotNearRooster=new ParrotNearRooster((Parrot) bird);
		parrotNearRooster.sing();
		
	}
}
