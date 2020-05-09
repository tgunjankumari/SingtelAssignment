package com.singtel.java.assignment.decorator;

import com.singtel.java.assignment.Fish;

public class FishDecorator extends Fish{

	private Fish fish;

	public FishDecorator(Fish fish) {
		super();
		this.fish = fish;
	}

}
