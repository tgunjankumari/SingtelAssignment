package com.singtel.java.assignment.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import com.singtel.java.assignment.Animal;
import com.singtel.java.assignment.Bird;
import com.singtel.java.assignment.constants.PrintConstants;
import com.singtel.java.assignment.constants.Species;
import com.singtel.java.assignment.factory.AnimalFactory;

public class AssignmentTest {

	@Rule
	public final SystemOutRule systemOutRule=new SystemOutRule().enableLog();
	
	private static final String newLine=System.lineSeparator();
	
	private static AnimalFactory animalFactory = new AnimalFactory();
	
	private static Animal animal;
	
	@Test
	public void testBirdSinging(){
		
		animal=new Bird();
		animal.sing();
		assertEquals(PrintConstants.SINGING, systemOutRule.getLog().replaceAll(newLine,""));
		assertNotSame(PrintConstants.WALKING, systemOutRule.getLog().replaceAll(newLine,""));
		systemOutRule.clearLog();
		
		animal = animalFactory.getAnimal(Species.BIRD);
		animal.sing();
		assertEquals(PrintConstants.SINGING, systemOutRule.getLog().replaceAll(newLine,""));
		assertNotSame(PrintConstants.WALKING, systemOutRule.getLog().replaceAll(newLine,""));
		systemOutRule.clearLog();		
		
	}
	
	@Test
	public void testDuckAndChicken(){
		animal=animalFactory.getAnimal(Species.DUCK);
		animal.sing();
		assertEquals(PrintConstants.DUCK_SINGING, systemOutRule.getLog().replaceAll(newLine,""));
		assertNotSame(PrintConstants.WALKING, systemOutRule.getLog().replaceAll(newLine,""));
		assertTrue(animal.swim());
		systemOutRule.clearLog();	
		
		animal=animalFactory.getAnimal(Species.CHICKEN);
		animal.sing();
		assertEquals(PrintConstants.CHICKEN_SINGING, systemOutRule.getLog().replaceAll(newLine,""));	
		assertNotSame(PrintConstants.WALKING, systemOutRule.getLog().replaceAll(newLine,""));
		assertFalse(animal.swim());
		assertFalse(animal.fly());
		systemOutRule.clearLog();	
	}
		
	@Test
	public void testRoosterAndRooster2(){
		animal=animalFactory.getAnimal(Species.ROOSTER);
		animal.sing();
		assertEquals(PrintConstants.ROOSTER_SINGING, systemOutRule.getLog().replaceAll(newLine,""));	
		assertNotSame(PrintConstants.WALKING, systemOutRule.getLog().replaceAll(newLine,""));
		assertFalse(animal.swim());
		assertFalse(animal.fly());
		systemOutRule.clearLog();	
		
		animal=animalFactory.getAnimal(Species.ROOSTER2);
		animal.sing();
		assertEquals(PrintConstants.ROOSTER_SINGING, systemOutRule.getLog().replaceAll(newLine,""));	
		assertNotSame(PrintConstants.WALKING, systemOutRule.getLog().replaceAll(newLine,""));
		assertFalse(animal.swim());
		assertFalse(animal.fly());
		systemOutRule.clearLog();	

	}

}
