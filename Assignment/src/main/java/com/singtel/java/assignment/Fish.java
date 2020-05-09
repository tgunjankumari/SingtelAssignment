package com.singtel.java.assignment;

import com.singtel.java.assignment.constants.Color;
import com.singtel.java.assignment.constants.PrintConstants;
import com.singtel.java.assignment.constants.Size;

public class Fish extends Animal {

	private Size size;
	private Color color;

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean eatsFish() {
		System.out.println(PrintConstants.NO_EATING_FISH);
		return false;
	}

	public boolean cracksJokes() {
		System.out.println(PrintConstants.NO_JOKING);
		return false;
	}

	public boolean sing() {
		System.out.println(PrintConstants.NO_SINGING);
		return false;
	}

	public boolean walk() {
		System.out.println(PrintConstants.NO_WALKING);
		return false;
	}

}
