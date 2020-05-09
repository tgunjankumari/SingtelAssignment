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
	@Test
	public void testBirdSinging(){
		
		Bird bird1=new Bird();
		bird1.sing();
		assertEquals(PrintConstants.SINGING, systemOutRule.getLog().replaceAll(newLine,""));
		assertNotSame(PrintConstants.WALKING, systemOutRule.getLog().replaceAll(newLine,""));
		systemOutRule.clearLog();
		
		Animal bird2 = animalFactory.getAnimal(Species.BIRD);
		bird2.sing();
		assertEquals(PrintConstants.SINGING, systemOutRule.getLog().replaceAll(newLine,""));
		assertNotSame(PrintConstants.WALKING, systemOutRule.getLog().replaceAll(newLine,""));
		systemOutRule.clearLog();		
		
		bird2=animalFactory.getAnimal(Species.DUCK);
		bird2.sing();
		assertEquals(PrintConstants.DUCK_SINGING, systemOutRule.getLog().replaceAll(newLine,""));
		assertNotSame(PrintConstants.WALKING, systemOutRule.getLog().replaceAll(newLine,""));
		assertTrue(bird2.swim());
		systemOutRule.clearLog();	
		
		bird2=animalFactory.getAnimal(Species.CHICKEN);
		bird2.sing();
		assertEquals(PrintConstants.CHICKEN_SINGING, systemOutRule.getLog().replaceAll(newLine,""));	
		assertNotSame(PrintConstants.WALKING, systemOutRule.getLog().replaceAll(newLine,""));
		assertFalse(bird2.swim());
		assertFalse(bird2.fly());
		systemOutRule.clearLog();	
	}

}
