package com.lirfu.neuralstrategy.units;

public class Unit {
	public static Unit[] units = { new Fighter() };

	private String name;

	protected Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
