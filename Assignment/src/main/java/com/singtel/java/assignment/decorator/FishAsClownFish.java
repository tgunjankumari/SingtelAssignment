package com.singtel.java.assignment.decorator;

import com.singtel.java.assignment.Fish;
import com.singtel.java.assignment.constants.Color;
import com.singtel.java.assignment.constants.PrintConstants;
import com.singtel.java.assignment.constants.Size;

public class FishAsClownFish extends FishDecorator {
	
	private Color color=Color.ORANGE;
	private Size size=Size.SMALL;

	public FishAsClownFish(Fish fish) {
		super(fish);
		super.setColor(color);
		super.setSize(size);
	}

	public boolean cracksJokes() {
		System.out.println(PrintConstants.JOKING);
		return true;
	}
	
}
