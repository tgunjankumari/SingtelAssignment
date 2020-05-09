package com.singtel.java.assignment.decorator;

import com.singtel.java.assignment.Fish;
import com.singtel.java.assignment.constants.Color;
import com.singtel.java.assignment.constants.PrintConstants;
import com.singtel.java.assignment.constants.Size;

public class FishAsShark extends FishDecorator {
	
	private Color color=Color.GRAY;
	private Size size=Size.LARGE;

	public FishAsShark(Fish fish) {
		super(fish);
		super.setColor(color);
		super.setSize(size);
	}

	public boolean eatsFish() {
		System.out.println(PrintConstants.EATING_FISH);
		return true;
	}
	
}
